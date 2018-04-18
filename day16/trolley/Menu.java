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
			System.out.println("**************�˵�******************");
			System.out.println("    1.�ӣ�2.�ģ�3.ɾ��4.�飻5.��");
			System.out.println("***********************************");
			System.out.println("����˵�ѡ��:");
			select = sc.nextInt();
			switch (select) {
			case 1:
				System.out.println("���\t����\t����\t����");
				set.forEach(System.out::println);
				System.out.println("����ѡ�����Ʒ���:");
				int no1 = sc.nextInt();
				if(findByNo(no1)!=null) {
					System.out.println("������������");
					car.add(findByNo(no1), sc.nextInt());
				}
				break;
			case 2:
				System.out.println("�����޸ĵ���Ʒ���:");
				int no2 = sc.nextInt();
				if(findByNo(no2)!=null) {
					System.out.println("�����µĸ�����");
					car.update(findByNo(no2), sc.nextInt());
				}
				break;
			case 3:
				System.out.println("����ɾ������Ʒ��:");
				int no3 = sc.nextInt();
				if(findByNo(no3)!=null) {
					car.delete(findByNo(no3));
				}
				break;
			case 4:
				System.out.println("���\t����\t����\t����");
				car.showCar();
				break;
			case 5:
				System.out.println("�˳�ϵͳ");
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
		System.out.println("û�и���Ʒ");
		return null;
	}
}
