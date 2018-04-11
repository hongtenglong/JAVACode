package day11.homeWork;

interface Inte1 {
	void taste();
}

interface Inte2 {
	void drive(String wheather);
}

interface Inte3 {
	void add(int a, int b);
}

class InteImpl{
	void taste(Inte1 inte1){
		inte1.taste();
	}
	void drive(String wheather,Inte2 inte2) {
		inte2.drive(wheather);
	}
	void add(int a,int b,Inte3 inte3) {
		inte3.add(a, b);
	}
}

public class ZuoYe4 {
	public static void main(String[] args) {
		InteImpl impl = new InteImpl();
		// 匿名类
		Inte1 inte1 = new Inte1() {
			@Override
			public void taste() {
				System.out.println("这苹果味道不错");
			}
		};
		impl.taste(inte1);
		
		// lambda表达式
		Inte2 inte2 = (wheather) -> {
			System.out.println("今天天气" + wheather);
		};
		impl.drive("晴空万里", inte2);

		// lambda表达式
		Inte3 inte3 = (a, b) -> {
			System.out.println(a + "+" + b + "的和为：" + (a + b));
		};
		impl.add(2, 3, inte3);
	}
}
