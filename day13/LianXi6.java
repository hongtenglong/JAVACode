package day13;

class JiaoShi{
	private int length;
	private int weight;
	class Desk{
		private int legNum;
		private int height;
		public int getLegNum() {
			return legNum;
		}
		public void setLegNum(int legNum) {
			this.legNum = legNum;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public void show() {
			System.out.println("ÿ��������"+legNum+"���ȣ���"+height+"cm��");
		}
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void show(Desk d,int deskNum) {
		System.out.println("������"+length+"m��,��"+weight+"m��,��"+deskNum+"������");
		d.show();
	}
	
}


public class LianXi6 {
	public static void main(String[] args) {
		JiaoShi.Desk desk = new JiaoShi().new Desk();
		desk.setHeight(50);
		desk.setLegNum(4);
		JiaoShi j = new JiaoShi();
		j.setLength(10);
		j.setWeight(7);
		j.show(desk, 25);

	}

}
