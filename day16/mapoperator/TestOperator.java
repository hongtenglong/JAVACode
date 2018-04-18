package day16.mapoperator;

import java.util.Scanner;

public class TestOperator {

	Goods [] goods = Database.getDatabase();
	/**�˵�*/
	public void menu() {
		System.out.println("-------------�˵�------------");
		System.out.println("\t 1.���");
		System.out.println("\t 2.�޸�");
		System.out.println("\t 3.ɾ��");
		System.out.println("\t 4.��ѯ");
		System.out.println("\t 5.�˳�");
		System.out.println("-----------------------------");
		System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ����");
		for(Goods g : goods) {
			if(g == null) {
				break;
			}
			System.out.println(g);
		}
		System.out.println("-----------------------------------");
	}
	public void startCartManager() {
		menu();//�˵�
		
		CartOperator cart = new CartOperator();
		int menuNo;
		int no;
		int count;
		Scanner input = new Scanner(System.in);
		while(true) {
			System.out.println("--����˵�ѡ�");
			menuNo = input.nextInt();
			switch(menuNo) {
			case 1:
				//��ӣ�
				System.out.println("--������Ʒ�ţ�");
				no= input.nextInt();
				System.out.println("-- ���빺�������");
				count = input.nextInt();
				Goods g = goods[no-1];
				cart.add(g, count);
				break;
			case 2:
				//�޸�
				break;
			case 3:
				//ɾ��
				break;
			case 4:
				//��ѯ
				cart.queryAll();
				break;
			case 5:
				//�˳�
				System.exit(0);
			}
		
		}
		
		
	}
	
	public static void main(String[] args) {
		
		new TestOperator().startCartManager();
	}

}
