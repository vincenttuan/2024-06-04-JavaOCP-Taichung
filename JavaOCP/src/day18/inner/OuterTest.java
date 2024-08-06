package day18.inner;

public class OuterTest {

	public static void main(String[] args) {
		Outer ou = new Outer();
		Outer.Inner in = ou.new Inner();
		in.callMe();
		// ---------------------------------------
		Outer.Inner in2 = new Outer().new Inner();
		in2.callMe();
		// ---------------------------------------
		new Outer().new Inner().callMe();
	}

}
