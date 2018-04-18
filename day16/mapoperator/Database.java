package day16.mapoperator;

public class Database {
	private static Goods [] goods = new Goods[100];
	public static Goods [] getDatabase(){
		Goods g1 = new Goods(1,"g1",11.1);
		Goods g2 = new Goods(2,"g2",21.1);
		Goods g3 = new Goods(3,"g3",31.1);
		Goods g4 = new Goods(4,"g4",41.1);
		Goods g5 = new Goods(5,"g5",51.1);
		goods[0] = g1;
		goods[1] = g2;
		goods[2] = g3;
		goods[3] = g4;
		goods[4] = g5;
		return goods;
		
	}
}
