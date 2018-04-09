package day09.homeWork;

class Employee {
	private int id;
	private String sex;
	private String name;
	private String duty;
	private double salary;
	private int holidays;
	public Employee() {}
	public Employee(int id, String sex, String name, String duty, double salary, int holidays) {
		super();
		this.id = id;
		this.sex = sex;
		this.name = name;
		this.duty = duty;
		this.salary = salary;
		this.holidays = holidays;
	}

	public void display() {
		System.out.println("姓名：" + name + " 性别：" + sex + " 职务：" + duty 
				+ " 薪水：" + salary + " 请假天数：" + holidays);
	}
	
	public int getDecMoney(int day) {
		if(day<=3) {
			return day*30;
		}else {
			return day*50;
		}
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHolidays() {
		return holidays;
	}

	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}

}


class Director extends Employee{
	private String assistantName;
	
	
	public Director(String assistantName) {
		super();
		this.assistantName = assistantName;
	}
	@Override
	public int getDecMoney(int day) {
		if(day<=3) {
			return day*50;
		}else {
			return day*80;
		}
	}
	public String getAssistantName() {
		return assistantName;
	}

	public void setAssistantName(String assistantName) {
		this.assistantName = assistantName;
	}
	
}

public class ZuoYe4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee(1, "男", "张五", "程序员", 5000, 3);
		e.setSalary(e.getSalary()-e.getDecMoney(e.getHolidays()));
		e.display();
	}

}
