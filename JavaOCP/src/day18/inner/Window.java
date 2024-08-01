package day18.inner;

public class Window { // 視窗類
	String title;
	
	public class Close { // 關閉類
		String title;
		public void click() { // 按一下
			System.out.println("關閉視窗");
		}
		
	}
	
	public class Open { // 開啟
		String title;
		public void click() {
			System.out.println("開啟視窗");
		}
		
	}
	
}
