package day08.homeWork;

import java.util.Scanner;

class Student{
	int id;
	String sex;
	String name;
	public static int mark(int day) {
		int score = 1000;
		return score = score - (day*3);
	}
}
public class ZuoYe1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ÇëÊäÈëÇë¼ÙÌìÊı:");
		System.out.println(Student.mark(sc.nextInt()));
	}
}
