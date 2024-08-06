package day18.static_inner;

public class MusicPlayerTest {
	public static void main(String[] args) {
		MusicPlayer musicPlayer = new MusicPlayer("Say you say me");
		MusicPlayer.Player player = musicPlayer.new Player();
		player.play();
		//----------------------------------------------------------
		MusicPlayer.AudioConverter.convert("Take on me", "mp3");
		
	}
}
