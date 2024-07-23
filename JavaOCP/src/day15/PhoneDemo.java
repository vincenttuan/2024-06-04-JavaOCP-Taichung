package day15;

public class PhoneDemo {

	public static void main(String[] args) {
		Phone p1 = new Panasonic();
		Phone p2 = new IPhone();
		Phone p3 = new Android();
		
		p1.call("04-2345-6789");
		p1.sendMessage("萬安演習");
		p2.call("0920123456");
		p2.sendMessage("明日放颱風假一日");
		p3.call("0930123456");
		p3.sendMessage("明日正常上班");
		
		((InternetService)p2).connectToInternet();
		((IPhone)p2).installApp("憤怒鳥");
		
		if(p2 instanceof Android) {
			((Android)p2).installApp("憤怒鳥");
		} else {
			System.out.println(p2.getClass() + " 無法轉 Android");
		}

	}

}
