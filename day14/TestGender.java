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
			System.out.println("男的");
		}else{
			System.out.println("不是男的");
		}
		this.gender = gender;
	}
	
}

public class TestGender {

	public static void main(String[] args) {
		/*StudentN stu = new StudentN();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入值:");
		Gender1 gender1 = Gender1.valueOf(sc.next());
		stu.setGender(gender1);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入值:");
		Gender1 gender = Gender1.valueOf(sc.next());
		switch (gender) {
		case MALE:
			System.out.println("男的");
			break;
		case FEMALE:
			System.out.println("女的");
			break;
		}
	}
}
