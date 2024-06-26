package day06;

import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

/**
 * 使用三維陣列 double[][][] 來表示一棟大樓中各個房間的溫度。
 * 假設這棟大樓有 3 層，每層有 4 個房間，每個房間有 2 個測量點。
 * 請初始化該三維陣列並打印出各個測量點的溫度。

 * 要求
 * 初始化一個三維陣列來表示大樓中各個房間的溫度，具體結構如下：
 * 第一維度代表樓層
 * 第二維度代表房間
 * 第三維度代表每個房間的測量點
 * 初始化每個測量點的溫度值（可以假設為任意合理的整數）。
 * 打印出每個測量點的溫度，輸出格式應包含樓層、房間和測量點的信息。
 * 
 */
public class MultiArray8 {
	 
	public static void main(String[] args) {
		//double[][][] temperatures = new double[3][4][2];
		double[][][] temperatures = { // [3][4][2]
				{
					{21, 22}, // 第1層第1個房間 
					{23, 24}, // 第1層第2個房間
					{25, 26}, // 第1層第3個房間
					{27, 28}  // 第1層第4個房間
				}, 
				{
					{29, 30}, // 第2層第1個房間
					{31, 32}, // 第2層第2個房間
					{33, 34}, // 第2層第3個房間
					{35, 36}  // 第2層第4個房間
				},
				{
					{37, 38}, // 第3層第1個房間
					{39, 40}, // 第3層第2個房間
					{41, 42}, // 第3層第3個房間
					{43, 44}  // 第3層第4個房間
				}
		};
		
		// 請印出
		// 第1層第1個房間溫度: 21, 22 平均: 21.5
		// 第1層第2個房間溫度: 23, 24 平均: 23.5
		// ...
		// 第3層第4個房間溫度: 43, 44 平均: 43.5
		// 1.使用 for-loop
		for(int i=0;i<temperatures.length;i++) { // 拆樓層
			for(int j=0;j<temperatures[i].length;j++) { // 拆房間
				double sum = 0;
				for(int k=0;k<temperatures[i][j].length;k++) { // 拆測量點
					sum += temperatures[i][j][k]; // 測量點的溫度值
				}
				double average = sum/temperatures[i][j].length;
				System.out.printf("第 %d 層第 %d 個房間溫度: %s 平均: %.1f%n",
						i+1, j+1, Arrays.toString(temperatures[i][j]), average);
			}
		}
		
		// 2.使用 for-each
		int floorNumber = 1;
		for(double[][] floors : temperatures) { // 拆樓層
			int roomNumber = 1;
			for(double[] rooms : floors) { // 拆房間
				double sum = 0;
				for(double temp : rooms) { // 拆測量點
					sum += temp;
				}
				double average = sum/rooms.length;
				System.out.printf("第 %d 層第 %d 個房間溫度: %s 平均: %.1f%n",
						floorNumber, roomNumber, Arrays.toString(rooms), average);
				roomNumber++;
			}
			floorNumber++;
		}
		
		// 3.使用 Stream
		for(int i=0;i<3;i++) {
			System.out.println(i + " Java");
		}
		
		IntStream.range(0, 3).forEach(i -> System.out.println(i + " Java"));
		
		IntStream.range(0, 3).forEach(i -> {
			System.out.println(i + " Java");
		});
		
		IntStream.range(0, temperatures.length).forEach(i -> { // 拆樓層
			IntStream.range(0, temperatures[i].length).forEach(j -> { // 拆房間
				double average = DoubleStream.of(temperatures[i][j])
									   .average()
									   .getAsDouble();
				System.out.printf("第 %d 層第 %d 個房間溫度: %s 平均: %.1f%n",
						i+1, j+1, Arrays.toString(temperatures[i][j]), average);		
			});
		});
		
	}

}
