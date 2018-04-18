package day16.mapoperator;

import java.util.Scanner;

public class TestOperator {

	Goods [] goods = Database.getDatabase();
	/**菜单*/
	public void menu() {
		System.out.println("-------------菜单------------");
		System.out.println("\t 1.添加");
		System.out.println("\t 2.修改");
		System.out.println("\t 3.删除");
		System.out.println("\t 4.查询");
		System.out.println("\t 5.退出");
		System.out.println("-----------------------------");
		System.out.println("商品编号\t商品名称\t商品单价");
		for(Goods g : goods) {
			if(g == null) {
				break;
			}
			System.out.println(g);
		}
		System.out.println("-----------------------------------");
	}
	public void startCartManager() {
		menu();//菜单
		
		CartOperator cart = new CartOperator();
		int menuNo;
		int no;
		int count;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("--输入菜单选项：");
			menuNo = input.nextInt();
			switch(menuNo) {
			case 1:
				//添加：
				System.out.println("--输入商品号：");
				no= input.nextInt();
				System.out.println("-- 输入购买个数：");
				count = input.nextInt();
				Goods g = goods[no-1];
				cart.add(g, count);
				break;
			case 2:
				//修改
				break;
			case 3:
				//删除
				break;
			case 4:
				//查询
				cart.queryAll();
				break;
			case 5:
				//退出
				System.exit(0);
			}
		
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new TestOperator().startCartManager();
	}

}
