package day20;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		// Queue 佇列 先進先出 FIFO
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(100);
		queue.offer(80);
		queue.offer(90);
		System.out.println(queue);
		
		while (!queue.isEmpty()) {
			// 取元素出來
			Integer data = queue.poll();
			System.out.println("取出:" + data);
		}
		
		System.out.println(queue);
		
	}
	
	
}
