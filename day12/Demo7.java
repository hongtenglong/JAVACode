package day12;

import java.util.Scanner;

public class Demo7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("������һ���ַ�����");
		String str = input.nextLine();
		char[] c = str.toCharArray();
		int u = 0, l = 0, n = 0, w = 0;
		for (char cs : c) {
			
			if (Character.isUpperCase(cs)) {
				u++;
			} else if (Character.isLowerCase(cs)) {
				l++;
			} else if (Character.isDigit(cs)) {
				n++;
			} else if (Character.isSpaceChar(cs)) {
				w++;
			}
		}
		System.out.println("Ӣ����ĸ��" + (u + l) + "\t���֣�" + n + "\t�ո�" + w);

	}

}