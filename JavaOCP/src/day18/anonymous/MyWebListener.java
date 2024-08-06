package day18.anonymous;

public class MyWebListener implements WebListener {

	@Override
	public void onPlay(String name) {
		System.out.println("我要監聽" + name);
	}

}
