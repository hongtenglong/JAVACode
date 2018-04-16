package day14;

class Student12{
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("this:"+this+"   "+System.currentTimeMillis());
	}
	
}

public class TestGC {

	public static void main(String[] args) {
		Student12 stu2 = new Student12();
		System.out.println("stu2对象:"+stu2+" "+System.currentTimeMillis());
		//引用中断
		stu2 = null;
		//通知进行垃圾回收
		System.gc();
	}
}
