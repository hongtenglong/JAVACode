package day11.staticinner;
/**
 * ��̬��Ա�ڲ���
 * @author Administrator
 *
 */
class Outer{
	
	int a = 1;
	
	static class Inner{
		
		int b = 2;
		public void show(){
			System.out.println();
		}
		
	}
	
}


public class TestStaticInner {
  public static void main(String[] args) {
	  
	Outer.Inner inner = new Outer.Inner();
	System.out.println(inner.b);
	
	
  }
}
