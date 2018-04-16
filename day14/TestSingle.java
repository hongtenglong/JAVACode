package day14;
//私有构造器
  //提供静态公开访问方法获取实例
/*class Student1{
	
	private static Student1 stu1 = new Student1();
	
	private Student1() {
	}
	
	public static Student1 getInstance(){
		if(stu1 == null){
			stu1 = new Student1();
		}
		return stu1;
	}
	
}*/

enum Gender2{
	//MAN,WOMEN
	MAN(1,"zs"),WOMAN(2,"ls");
	
	int no;
	String name;
	//枚举类构造方法私有
	private Gender2(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public void show(){
		System.out.println("aaa");
	};
	
}



class Student1{
	
	private Gender2 gender;

	public Gender2 getGender() {
		return gender;
	}

	public void setGender(Gender2 gender) {
		this.gender = gender;
	}
	/*private String sex;
	
	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}*/
	
}


public class TestSingle {
	public static void main(String[] args) {
		Student1 stu1 = new Student1();
		stu1.setGender(Gender2.valueOf("MAN"));
		System.out.println(stu1.getGender());
		Gender2.MAN.show();
		/*stu1.setSex("aaa");
		System.out.println(stu1.getSex());*/
	}
}
