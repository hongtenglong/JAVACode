package day12;
/**Á·Ï°£ºString*/
public class TestString {
	//È¡×ó´®
	public String leftStr(String s,int len) {
		//[0,len)  9 µ½len-1
		return s.substring(0, len);
	}
	//È¡ÓÒ´®
	public String rightStr(String s,int len) {
		return s.substring(s.length()-len);
	}
	public static void main(String[] args) {
		// ×ó´®
		TestString t = new TestString();
		System.out.println(t.leftStr("abcdefg", 2));
		//ÓÒ´®
		System.out.println(t.rightStr("abcdefg", 2));
	}

}
