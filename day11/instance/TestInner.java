package day11.instance;


/**
 * ʵ����Ա�ڲ���
 * @author Administrator
 *
 * static���α����������
 * ���η������෽��
 * 
 */
class Outer {
	
	int a = 1;
	
	public static void show(){
		/*Inner inner = new Inner();
		System.out.println(inner.b);*/
		
	}
	
	class Inner{
		
		int b = 2;
		
		int a = 2;
		
		public void show(){
			System.out.println(Outer.this.a);
		}
		
	}
	
}

public class TestInner{
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.show();
		
		//�����ڲ������
		/*Outer.Inner  inner = new Outer().new Inner();
		inner.show();*/
	}
}


