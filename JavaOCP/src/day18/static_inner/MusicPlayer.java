package day18.static_inner;

// Walkman 隨身聽
public class MusicPlayer {
	private String name;
	
	public MusicPlayer(String name) {
		this.name = name;
	}
	
	// 內部撥放器
	// 需要存取 MusicPlayer 的成員資料, 例如: name
	public class Player {
		public void play() {
			if(name != null) {
				System.out.println("播放" + name);
			}
		}
	}
	
	// 音頻格式轉換器
	public static class AudioConverter {
		// 將指定的音頻文件轉換成指定格式
		// 不需要存取 MusicPlayer 的成員資料
		public static void convert(String file, String encode) {
			System.out.println("將" + file + "轉換成" + encode + "格式");
		}
	}
	
}
