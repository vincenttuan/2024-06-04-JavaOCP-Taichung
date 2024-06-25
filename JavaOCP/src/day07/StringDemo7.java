package day07;

public class StringDemo7 {

	public static void main(String[] args) {
		// StringBuffer 可變動字串
		StringBuffer sb = new StringBuffer("Java");
		sb.append("OCP");
		System.out.println(sb);
		//System.out.println(sb.toString());
		
		String s = "JavaOCP";
		
		// StringBuffer 與 String 比較
		System.out.println(s.equals(sb));
		System.out.println(s.equals(sb.toString()));
	}

}
