package day08;
//����ģʽ
//����ʽ
/*class Window{
	private static Window win = new Window();
	private Window() {};
	public static Window getInstace() {
		return win;
	}
}*/

//����ʽ
class Window{
	private static Window win = null;
	private Window() {};
	public static Window getInstace() {
		if(win==null) {
			win = new Window();
		}
		return win;
	}
}


public class Demo2 {

	public static void main(String[] args) {
		Window win1 = Window.getInstace();
		Window win2 = Window.getInstace();
		Window win3 = Window.getInstace();
		System.out.println(win1);
		System.out.println(win2);
		System.out.println(win3);
	}
}
