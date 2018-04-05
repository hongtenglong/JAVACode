package day07;

public class Demo3 {
	public static void main(String[] args) {
		//test1 t  = new test1();
		//t.f(1);
//		for(int i = 0;i<1000;i++) {
//			new test2(i).start();
//		}
		test2 t = new test2();
		t.test1();
	}
}

class test2 extends Thread {
	int i;
	test2(){
		
	}
	test2(int j){
		this.i = j;
	}
	
	public void test1() {
		System.out.print("test1");
		test2();
	}
	public void test2() {
		System.out.print("test2");
		test1();
		}
	@Override
	public void run() {
		for(long i = 0;i>=0;i++) {
			System.out.print(this.i+"*");
			if(i/999999==0) {
				i = 0;
				System.out.println();
			}
		}
	}
}