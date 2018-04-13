package day13.stage2;
class ClassRoom{
	private double length;
	private double width;
	
	public ClassRoom(double length, double width) {
		super();
		this.length = length;
		this.width = width;
	}
	class Table{
		private int count;
		private double height;
		public Table(int count, double height) {
			this.count = count;
			this.height = height;
		}
		public void showTable() {
			System.out.println("×À×Ó£º"+count+","+height);
		}
	}
	public void showClassRoom(){
		Table t = new Table(4, 20);
		System.out.println("½ÌÊÒ£º"+length+","+width);
		t.showTable();
	}
}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassRoom cr = new ClassRoom(50, 20);
		cr.showClassRoom();
	}

}
