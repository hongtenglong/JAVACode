package day14;

import java.util.Scanner;

enum Gender{
	男,女;
	
}
class Student2{
	private Gender g;
	public Gender getG() {
		return g;
	}

	public void setG(Gender g) {
		if(g == Gender.男) {
			System.out.println("男的");
		}else if(g == Gender.女){
			System.out.println("女的");
		}
		this.g = g;
	}
	
}
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入值：");
		Gender g = Gender.valueOf(sc.next());
		switch(g) {
		case 男:
			System.out.println("男的");
			break;
		case 女:
			System.out.println("女的");
			break;
		}
	}
}
