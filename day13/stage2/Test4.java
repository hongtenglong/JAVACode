package day13.stage2;
interface Vehicle{
	void start(String str);
	void stop(String str);
}
class Bus implements Vehicle{
	@Override
		public void start(String str) {
			System.out.println(str+"启动");
		}

		@Override
		public void stop(String str) {
			System.out.println(str+"停止");
		}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
	     bus.start("公共汽车");
	     bus.stop("公共汽车");
	}

}
