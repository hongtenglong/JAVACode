package day11.part;
/**
 * �ֲ��ڲ���    
 * @author Administrator
 *
 */
class Outer{
	
	static int a = 1;
	
	//��ͨ����
	public void func(){
		//jdk 7������:����ʹ��final����
		//jdk 8+:����ֱ�ӷ��ʾֲ����������ǲ����޸�ֵ��
		//�ֲ�����
		int a = 2;
		class Inner{
			public void show(){
				System.out.println(a);
			}
		}
		
		Inner inner = new Inner();
		inner.show();
	}
	//��̬����
	public static void func2(){
		class Inner{
			public void show(){
				System.out.println(a);
			}
		}
	}
	
}


public class TestInner {

	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.func();
	}
}
