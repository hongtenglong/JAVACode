package day16.operator;

import java.util.Scanner;

/**����*/
public class TestCartOperator {

	public  void menu() {
		CartOperator cart = new CartOperator();//��
		Scanner input = new Scanner(System.in);
		
		System.out.println("\t-------------�˵�--------------");
		System.out.println("\t1.��ӣ�2.�޸ģ�3.ɾ����4.��ѯ��5.�˳�");
		System.out.println("\t-------------------------------");
		int menuNum;//�˵���ѡ��
		int no;
		String name;
		double price;
		int count;
		
		while(true) {
			System.out.println("--����ѡ��");
			menuNum = input.nextInt();
			switch(menuNum) {
			case 1:
				//���
				System.out.println("--�����ţ�");
				no = input.nextInt();
				System.out.println("--��������:");
				name = input.next();
				System.out.println("--����۸�");
				price = input.nextDouble();
				System.out.println("--���������");
				count = input.nextInt();
				Goods goods = new Goods(no,name,price,count);
				cart.add(goods);
				break;
			case 2:
				//�޸�;
				System.out.println("--����Ҫ�޸ĵ���Ʒ�ı�ţ�");
				no = input.nextInt();
				System.out.println("--�����µ�������");
				count = input.nextInt();
				cart.modify(no, count);
				break;
			case 3:
				//ɾ����
				System.out.println("--����ɾ������Ʒ�ı�ţ�");
				no = input.nextInt();
				cart.delete(no);
				break;
			case 4:
				//��ѯ
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
