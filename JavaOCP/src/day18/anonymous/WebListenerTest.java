package day18.anonymous;

public class WebListenerTest {

	public static void main(String[] args) {
		WebListener listener1 = new WebListener() {
			@Override
			public void onPlay(String name) {
				System.out.println("我要監聽" + name);
			}
		};
		
		WebListener listener2 = new WebListener() {
			@Override
			public void onPlay(String name) {
				System.out.println("我要觀察" + name + "目前流量");
			}
		};
		
		listener1.onPlay("小白");
		listener2.onPlay("國道1號");
	}

}
