package day19;
class Student{
	
}
public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException {
		//获取Class对象
		Class clz = Class.forName("day19.Student");
		Class clz1 = Student.class;
		Student stu = new Student();
		Class clz2 = stu.getClass();
	}

}
