package day14;

import java.util.Scanner;

enum Gender1{
	MALE,FEMALE
}

class StudentN{
	private Gender1 gender;

	public Gender1 getGender() {
		return gender;
	}

	public void setGender(Gender1 gender) {
		if(gender == Gender1.MALE){
			System.out.println("�е�");
		}else{
			System.out.println("�����е�");
		}
		this.gender = gender;
	}
	
}

public class TestGender {

	public static void main(String[] args) {
		/*StudentN stu = new StudentN();
		Scanner sc = new Scanner(System.in);
		System.out.println("������ֵ:");
		Gender1 gender1 = Gender1.valueOf(sc.next());
		stu.setGender(gender1);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������ֵ:");
		Gender1 gender = Gender1.valueOf(sc.next());
		switch (gender) {
		case MALE:
			System.out.println("�е�");
			break;
		case FEMALE:
			System.out.println("Ů��");
			break;
		}
	}
}
