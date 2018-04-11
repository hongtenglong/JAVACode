package day11.hidename;

interface Inter {
  void show();
}

interface Inter2{
	void show();
}

/*class InterImpl implements Inter,Inter2{
	@Override
	public void show() {
		System.out.println("aa");
	}
}*/

class Father{
	public void show(String name){
		System.out.println("aa");
	}
}



public class TestInner{
	public static void main(String[] args) {
		
		//匿名内部类
		new Inter() {
			//static int a = 12;
			@Override
			public void show() {
				System.out.println("aa in inter");
			}
		}.show();
		
		new Inter2() {
			@Override
			public void show() {
				System.out.println("aa in inter2");
			}
		};
		
		/*new Father(){
			@Override
			public void show(String name) {
				System.out.println(name);
			}
		}.show("zs");*/
		
	}
}