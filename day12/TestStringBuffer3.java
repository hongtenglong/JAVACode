package day12;

import java.util.Scanner;

/**��ϰ��StringBuffer*/
public class TestStringBuffer3 {
	public void reverseStr(String s) {
		if(s.length() % 2 == 0) {
			System.out.println("����");
		}else {
			StringBuffer sf = new StringBuffer(s);
	//		System.out.println(sf.reverse());
			String s1 = sf.reverse().toString();
			if(s.equals(s1)) {
				System.out.println("��");
			}else {
				System.out.println("����");
			}
		}
	}
	public static void main(String[] args) {
		//�ַ�����ת
		Scanner input = new Scanner(System.in);
		System.out.println("�����ַ���;");
		String str = input.next();
		TestStringBuffer3 t = new TestStringBuffer3();
		t.reverseStr(str);
	}

}
