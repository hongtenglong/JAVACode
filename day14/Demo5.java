package day14;

import java.util.Scanner;

enum Gender{
	��,Ů;
	
}
class Student2{
	private Gender g;
	public Gender getG() {
		return g;
	}

	public void setG(Gender g) {
		if(g == Gender.��) {
			System.out.println("�е�");
		}else if(g == Gender.Ů){
			System.out.println("Ů��");
		}
		this.g = g;
	}
	
}
public class Demo5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ֵ��");
		Gender g = Gender.valueOf(sc.next());
		switch(g) {
		case ��:
			System.out.println("�е�");
			break;
		case Ů:
			System.out.println("Ů��");
			break;
		}
	}
}
