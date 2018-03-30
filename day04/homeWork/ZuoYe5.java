package day04.homeWork;

import java.util.Scanner;

public class ZuoYe5 {

	public static void main(String[] args) {
		String [] s = {"apple","banana","cat","dog","flower","github","hehe","haha","iphon","java"};
		String flag = "no";
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个单词：");
		String in = sc.next();
		for (String string : s) {
			if(string.equals(in)) {
				flag = "yes";
				break;
			}
		}
		System.out.println(flag);
	}

}
