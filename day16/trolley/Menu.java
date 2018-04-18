package day16.trolley;

import java.util.Scanner;
import java.util.Set;

public class Menu {
	Scanner sc = new Scanner(System.in);
	Set<Goods> set = new GoodsData().initialize();
	Car car = new Car();

	public void go() {
		int select = 1;
		while (select != 5) {
			System.out.println();
			System.out.println("**************菜单******************");
			System.out.println("    1.加；2.改；3.删；4.查；5.退");
			System.out.println("***********************************");
			System.out.println("输入菜单选择:");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("编号\t名称\t单价\t个数");
				set.forEach(System.out::println);
				System.out.println("输入选择的商品编号:");
				int no1 = sc.nextInt();
				if(findByNo(no1)!=null) {
					System.out.println("请输入数量：");
					car.add(findByNo(no1), sc.nextInt());
				}
				break;
			case 2:
				System.out.println("输入修改的商品编号:");
				int no2 = sc.nextInt();
				if(findByNo(no2)!=null) {
					System.out.println("输入新的个数：");
					car.update(findByNo(no2), sc.nextInt());
				}
				break;
			case 3:
				System.out.println("输入删除的商品号:");
				int no3 = sc.nextInt();
				if(findByNo(no3)!=null) {
					car.delete(findByNo(no3));
				}
				break;
			case 4:
				System.out.println("编号\t名称\t单价\t个数");
				car.showCar();
				break;
			case 5:
				System.out.println("退出系统");
				break;
			}
		}
	}

	public Goods findByNo(int no) {
		for (Goods goods : set) {
			if (goods.getNo() == no) {
				return goods;
			}
		}
		System.out.println("没有该商品");
		return null;
	}
}
