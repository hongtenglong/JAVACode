package day12;

import java.util.Scanner;

/**��ϰ����װ��*/
public class TestString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * ����һ���ַ���������̨������ַ�����
			Ӣ����ĸ�ĸ�����
			���ֵĸ�����
			�ո�ĸ���
		 */
		//����һ��
/*		char c = ' ';
		if(c >= 'a' && c <= 'z' || c >= 'A' && c<= 'Z') {
			System.out.println("���ַ�");
		}else if(c >= '0' && c <= '9') {
			System.out.println("������");
		}else if(c == ' ') {
			System.out.println("�ǿո�");
		}*/
		//������:
		Scanner input = new Scanner(System.in);
		System.out.println("����һ���ַ���:");
		String s = input.nextLine();
		char [] cs = s.toCharArray();
		int u = 0,l = 0,n = 0,w = 0;
		for(char c:cs) {
			if(Character.isUpperCase(c)) {
				u ++;
			}else if(Character.isLowerCase(c)) {
				l ++;
			}else if(Character.isDigit(c) ){
				n ++;
			}else if(Character.isWhitespace(c)) {
				w ++;
			}
		}
		System.out.println("Ӣ����ĸ��"+(u+l)+"����:"+n+"�ո�"+w);
	}

}








