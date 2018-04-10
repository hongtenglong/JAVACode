package day10;
//父类 ，超类 
/**示例：类多态*/
class Teacher{
	protected String name;
	public void giveLesson() {
		System.out.println("讲数学课");
	}
}
//子类
class JavaTeacher extends Teacher{
	String tattoo;
	//1
	public void giveLesson() {
		System.out.println(name+"讲java课,纹身是："+tattoo);
	}
	public void show() {
		System.out.println("show");
	}
	public void sing() {
		System.out.println("唱歌");
	}
}
class SqlTeacher extends Teacher{
	public void giveLesson() {
		System.out.println(name+"讲sql课,纹身是：");
	}
	public void dance() {
		System.out.println("跳舞");
	}
}
public class TestTeacher {
	public static void main(String[] args) {
		//2
		Teacher guoxiang = new JavaTeacher();
		guoxiang.name = "郭襄";
//		guoxiang.tattoo = "米老鼠";
		guoxiang.giveLesson();
//		guoxiang.sing();
//		guoxiang.show();
		
		Teacher guofu = new SqlTeacher();
		guofu.name = "郭芙";
		guofu.giveLesson();
//		guofu.dance();
		
		//多态 ：会屏蔽子类之间的差异，只能调用父类中定义的公共的内容。
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
