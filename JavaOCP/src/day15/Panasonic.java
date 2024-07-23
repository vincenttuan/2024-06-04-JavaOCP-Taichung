package day15;

// 國際牌電話
public class Panasonic implements Phone {

	@Override
	public void call(String number) {
		System.out.println("打電話:" + number);
	}

	@Override
	public void sendMessage(String message) {
		System.out.println("傳簡訊:" + message);
	}
	
}
