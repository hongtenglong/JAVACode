package day12;

import java.util.Scanner;

/**练习：StringBuffer*/
public class TestStringBuffer3 {
	public void reverseStr(String s) {
		if(s.length() % 2 == 0) {
			System.out.println("不是");
		}else {
			StringBuffer sf = new StringBuffer(s);
	//		System.out.println(sf.reverse());
			String s1 = sf.reverse().toString();
			if(s.equals(s1)) {
				System.out.println("是");
			}else {
				System.out.println("不是");
			}
		}
	}
	public static void main(String[] args) {
		//字符串反转
		Scanner input = new Scanner(System.in);
		System.out.println("输入字符串;");
		String str = input.next();
		TestStringBuffer3 t = new TestStringBuffer3();
		t.reverseStr(str);
	}

}
