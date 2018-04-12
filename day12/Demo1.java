package day12;

public class Demo1 {
	public String leftStr(String s,int len) {
		return s.substring(0, len);
	}
	public String rightStr(String s,int len) {
		return s.substring(len+1, s.length());
	}
	public static void main(String[] args) {
		Demo1 d = new Demo1();
		System.out.println(d.rightStr("abcdefg", 3));
		System.out.println(d.leftStr("abcdefg", 3));
	}
}
