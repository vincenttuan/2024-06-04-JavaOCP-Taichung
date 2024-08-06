package day18.anonymous;

public class WebListenerTest {

	public static void main(String[] args) {
		// 一般方式透過自訂的 MyWebListener 來實現 WebListener
		WebListener webListener1 = new MyWebListener();
		webListener1.onPlay("小白");
		
		// 透過匿名內部類別來實現 WebListener
		WebListener webListener2 = new WebListener() {
			
			@Override
			public void onPlay(String name) {
				System.out.println("我要監聽" + name);
			}
		};
		webListener2.onPlay("小白");
	}

}
