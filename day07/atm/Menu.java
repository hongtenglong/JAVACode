package day07.atm;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	User[] users = new User[100];
	int index;

	public void mainMenu() {
		System.out.println("--------------------���˵�--------------------");
		System.out.println("\t 1.��Ǯ    2.ȡǮ   3.ת��  4.�����   5.�˳�");
		System.out.println("----------------------------------------------");
		System.out.print("--������ѡ��");
		switch (sc.nextInt()) {
		case 1:
			saveMoney();
			break;
		case 2:
			takeMoney();
			break;
		case 3:
			moveMoney();
			break;
		case 4:
			getMoney();
			break;
		case 5:
			System.out.println("�˳�ϵͳ�ɹ���");
			index = -1;
			mainMenu1();
			break;
		default:
			System.out.println("����������������");
			mainMenu();
			break;
		}
	}

	public void mainMenu1() {
		System.out.println("--------------------ATM����ϵͳ--------------------");
		System.out.println("\t  1.��½    2.����     3.�˳�");
		System.out.println("--------------------------------------------------");
		System.out.print("--������ѡ��");
		switch (sc.nextInt()) {
		case 1:
			if (login()) {
				mainMenu();
			} else {
				mainMenu1();
			}
			break;
		case 2:
			if (addUser()) {
				mainMenu1();
			} else {
				mainMenu1();
			}
			break;
		case 3:
			System.out.println("�˳�ϵͳ�ɹ���");
			System.exit(0);
			break;
		default:
			System.out.println("����������������");
			mainMenu1();
			break;
		}
	}

	/** �û���½ */
	public boolean login() {
		boolean b = false;
		System.out.print("--���뿨�ţ�");
		String no = sc.next();
		System.out.print("--�������룺");
		String pwd = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null)
				break;
			if (users[i].getNo().equals(no) && users[i].getPwd().equals(pwd)) {
				b = true;
				index = i;
				break;
			}
		}
		System.out.println(b ? "��½�ɹ�" : "�˻����������,����������");
		return b;
	}

	/** �û����� */
	public boolean addUser() {
		boolean b = false;
		User u = new User();
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				u.setNo(i + 1);
				System.out.print("���������֤���룺");
				u.setShenFenZhen(sc.next());
				System.out.print("���������룺");
				u.setPwd(sc.next());
				users[i] = u;
				System.out.println("����\t���");
				System.out.println(users[i].getNo() + "\t" + users[i].getMoney());
				b = true;
				break;
			}
		}
		System.out.println(b ? "�����ɹ������½" : "����ʧ�ܣ������¿���");
		return b;
	}

	/** ��Ǯ */
	public void saveMoney() {
		System.out.print("�������Ǯ�Ľ�");
		double d = sc.nextDouble();
		users[index].setMoney(users[index].getMoney() + d);
		System.out.println("��Ǯ�ɹ�");
		System.out.println(users[index]);
		mainMenu();
	}

	/** ȡǮ */
	public void takeMoney() {
		System.out.print("������ȡǮ�Ľ�");
		double d = sc.nextDouble();
		if (d > users[index].getMoney()) {
			System.out.println("�㲢û����ô��Ǯ�����������ȿ������");
		} else {
			users[index].setMoney(users[index].getMoney() - d);
		}
		System.out.println("ȡǮ�ɹ�");
		System.out.println(users[index]);
		mainMenu();
	}

	/** ת�� */
	public void moveMoney() {
		System.out.print("������Ҫת�˵Ŀ��ţ�");
		String no = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				System.out.println("û�иÿ���");
				break;
			}
			if (users[i].getNo().equals(no)) {
				System.out.print("������ת�˽�");
				double money = sc.nextDouble();
				if (money > users[index].getMoney()) {
					System.out.println("�㲢û����ô��Ǯ�����������ȿ������");
				} else {
					users[index].setMoney(users[index].getMoney() - money);
					users[i].setMoney(users[i].getMoney() + money);
					System.out.println("�ɹ��򿨺�"+no+" ת���"+money);
				}
				break;
			}
		}
		mainMenu();
	}
	/** ����� */
	public void getMoney() {
		System.out.println(users[index]);
		mainMenu();
	}

}
