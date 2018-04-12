package day12;

import java.util.Scanner;

/**练习：包装类*/
public class TestString4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 输入一个字符串，控制台输出此字符串中
			英文字母的个数，
			数字的个数，
			空格的个数
		 */
		//方法一：
/*		char c = ' ';
		if(c >= 'a' && c <= 'z' || c >= 'A' && c<= 'Z') {
			System.out.println("是字符");
		}else if(c >= '0' && c <= '9') {
			System.out.println("是数字");
		}else if(c == ' ') {
			System.out.println("是空格");
		}*/
		//方法二:
		Scanner input = new Scanner(System.in);
		System.out.println("输入一行字符串:");
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
		System.out.println("英文字母："+(u+l)+"数字:"+n+"空格："+w);
	}

}








