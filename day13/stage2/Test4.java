package day13.stage2;
interface Vehicle{
	void start(String str);
	void stop(String str);
}
class Bus implements Vehicle{
	@Override
		public void start(String str) {
			System.out.println(str+"����");
		}

		@Override
		public void stop(String str) {
			System.out.println(str+"ֹͣ");
		}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus bus = new Bus();
	     bus.start("��������");
	     bus.stop("��������");
	}

}
