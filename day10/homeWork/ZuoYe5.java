package day10.homeWork;

import java.util.Scanner;

abstract class Employee1{
	int id;
	int sex;
	String name;
	String duty;
	double salary;
	int holidays;
	
	public Employee1(int id, int sex, String name, String duty, double salary, int holidays) {
		super();
		this.id = id;
		this.sex = sex;
		this.name = name;
		this.duty = duty;
		this.salary = salary;
		this.holidays = holidays;
	}
	public  void display() {
		String s = "";
		if(sex ==1) {
			s="Ů";
		}else if(sex==0) {
			s="��";
		}else {
			s = "δ֪";
		}
		System.out.println("������"+name+"�Ա�"+s+"ְ��"+duty+"���ʣ�"+salary);
	}
	public abstract int getSubsidy(int day);
}
class NorMalEmployee extends Employee1{

	public NorMalEmployee(int id, int sex, String name, String duty, double salary, int holidays) {
		super(id, sex, name, duty, salary, holidays);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getSubsidy(int day) {
		// TODO Auto-generated method stub
		holidays = day;
		if(day<=3) {
			salary += 20*(30-day);
			return (int)salary;
		}else {
			salary += 15*(30-day);
			return (int)salary;
		}
	}
	
}

class Director extends Employee1{

	public Director(int id, int sex, String name, String duty, double salary, int holidays) {
		super(id, sex, name, duty, salary, holidays);
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getSubsidy(int day) {
		holidays = day;
		if(day<=3) {
			salary += 30*(30-day);
			return (int)salary;
		}else {
			salary += 20*(30-day);
			return (int)salary;
		}
	}
	
}


public class ZuoYe5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		NorMalEmployee n = new NorMalEmployee(1, 1, "LY", "�����", 4500, 1);
		Director d = new Director(1, 1, "HTL", "�ල", 5000, 1);
		System.out.print("������ͨԱ�����������");
		n.getSubsidy(sc.nextInt());
		n.display();
		System.out.print("���붭�³����������");
		d.getSubsidy(sc.nextInt());
		d.display();
	}
}
