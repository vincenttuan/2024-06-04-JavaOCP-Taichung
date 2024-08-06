package day18.method_inner;

// 炒飯
public class FriedRice {
	
	// 準備
	public void prepare(String friedRiceName) {
		
		// 炒鍋
		class Wok {
			void heatUp() { // 熱鍋
				System.out.println("加熱鍋具, 準備炒製: " + friedRiceName);
			}
		}
		
		Wok wok = new Wok();
		wok.heatUp(); // 熱鍋
		
		System.out.println("正在炒製: " + friedRiceName);
	}
	
}
