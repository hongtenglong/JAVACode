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
		System.out.println("stu2����:"+stu2+" "+System.currentTimeMillis());
		//�����ж�
		stu2 = null;
		//֪ͨ������������
		System.gc();
	}
}
