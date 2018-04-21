package day18.lianxi;

class Student4 {
	private int sNo;
	private String sName;
	private String sex;
	private int sAge;
	private double sJava;

	public Student4() {
		super();
	}

	public Student4(int sNo, String sName, String sex, int sAge, double sJava) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.sex = sex;
		this.sAge = sAge;
		this.sJava = sJava;
	}

	public int getsNo() {
		return sNo;
	}

	public String getsName() {
		return sName;
	}

	public String getSex() {
		return sex;
	}

	public int getsAge() {
		return sAge;
	}

	public double getsJava() {
		return sJava;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return sNo + "\t" + sName + "\t" + sex + "\t" + sAge + "\t" + sJava;
	}

}

public class LianXi4 {

	public static void main(String[] args) {
		Student4[] s = new Student4[5];
		s[0] = new Student4(1, "A", "男", 18, 87.5);
		s[1] = new Student4(2, "B", "男", 14, 82.5);
		s[2] = new Student4(3, "C", "男", 12, 67.5);
		s[3] = new Student4(4, "D", "男", 19, 45.5);
		s[4] = new Student4(5, "E", "男", 16, 92.5);
		double min = s[0].getsJava();
		double max = s[0].getsJava();
		System.out.println("学号\t名字\t性别\t年龄\t成绩");
		for (Student4 student4 : s) {
			System.out.println(student4);
			if (min > student4.getsJava()) {
				min = student4.getsJava();
			}
			if (max < student4.getsJava()) {
				max = student4.getsJava();
			}
		}
		System.out.println("最高成绩为："+max);
		System.out.println("最低成绩为："+min);
	}

}
