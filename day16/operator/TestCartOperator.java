package day16.operator;

import java.util.Scanner;

/**测试*/
public class TestCartOperator {

	public  void menu() {
		CartOperator cart = new CartOperator();//车
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t-------------菜单--------------");
		System.out.println("\t1.添加；2.修改；3.删除；4.查询；5.退出");
		System.out.println("\t-------------------------------");
		int menuNum;//菜单项选择
		int no;
		String name;
		double price;
		int count;
		
		while(true) {
			System.out.println("--输入选择：");
			menuNum = input.nextInt();
			switch(menuNum) {
			case 1:
				//添加
				System.out.println("--输入编号：");
				no = input.nextInt();
				System.out.println("--输入名字:");
				name = input.next();
				System.out.println("--输入价格：");
				price = input.nextDouble();
				System.out.println("--输入个数：");
				count = input.nextInt();
				Goods goods = new Goods(no,name,price,count);
				cart.add(goods);
				break;
			case 2:
				//修改;
				System.out.println("--输入要修改的商品的编号：");
				no = input.nextInt();
				System.out.println("--输入新的数量：");
				count = input.nextInt();
				cart.modify(no, count);
				break;
			case 3:
				//删除；
				System.out.println("--输入删除的商品的编号：");
				no = input.nextInt();
				cart.delete(no);
				break;
			case 4:
				//查询
				cart.queryAll();
				break;
			case 5:
				System.exit(0);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new TestCartOperator().menu();

	}

}
