package day06.homeWork;


public class ZuoYe09 {
	public static void main(String[] args) {
		Emloyee e1 = new Emloyee();
		e1.no = 1;
		e1.name = "a";
		e1.phone = "123";
		e1.salary = 100;
		e1.height = 170;
		
		Emloyee e2 = new Emloyee();
		e2.no = 2;
		e2.name = "a";
		e2.phone = "1235";
		e2.salary = 200;
		e2.height = 171;
		Emloyee e3 = new Emloyee();
		e3.no = 3;
		e3.name = "c";
		e3.phone = "1223";
		e3.salary = 400;
		e3.height = 174;
		Emloyee e4 = new Emloyee();
		e4.no = 4;
		e4.name = "d";
		e4.phone = "321";
		e4.salary = 562;
		e4.height = 169;
		Emloyee [] emloyeeArr = {e1,e2,e3,e4};
		
		Admin admin = new Admin();
		admin.avgHeight(emloyeeArr);
		admin.totalSalary(emloyeeArr);
	}
}

class Emloyee {
	int no;
	String name;
	String phone;
	int height;
	int salary;

	public void show() {
		System.out.println("我的员工编号是：" + no + " 我名字叫" + name + " 我的电话是" + phone + " 我有" + height + "cm高 每月工资是" + salary);
	}
}
class Admin {
	public void avgHeight(Emloyee[] emloyee) {
		double sum = 0;
		for (int i = 0; i < emloyee.length; i++) {
			sum+=emloyee[i].height;
		}
		System.out.println("所有员工的平均身高是："+sum/emloyee.length);
	}
	public void totalSalary(Emloyee[] emloyee) {
		int sum = 0;
		for (int i = 0; i < emloyee.length; i++) {
			sum+=emloyee[i].salary;
		}
		System.out.println("员工的总工资为："+sum);
	}
}





