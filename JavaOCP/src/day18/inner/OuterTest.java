package day18.inner;

public class OuterTest {

	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.callMe();
	}

}
