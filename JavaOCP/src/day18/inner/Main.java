package day18.inner;

public class Main {

	public static void main(String[] args) {
		Window win = new Window();
		Window.Close winClose = win.new Close();
		winClose.click();
		//----------------------------------------
		Window.Open winOpen = win.new Open();
		winOpen.click();
		
	}

}
