package day16;

public class LoL extends Game {
	
	public LoL(String name) {
		this.name = name;
	}
	
	@Override
	public void copyRight() {
		System.out.println(name + "版權所有");
	}
	
	
}
