package day07.atm;

import java.util.Scanner;

public class Menu {
	Scanner sc = new Scanner(System.in);
	User[] users = new User[100];
	int index;

	public void mainMenu() {
		System.out.println("--------------------主菜单--------------------");
		System.out.println("\t 1.存钱    2.取钱   3.转账  4.查余额   5.退出");
		System.out.println("----------------------------------------------");
		System.out.print("--请输入选择：");
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
			System.out.println("退出系统成功！");
			index = -1;
			mainMenu1();
			break;
		default:
			System.out.println("输入有误，重新输入");
			mainMenu();
			break;
		}
	}

	public void mainMenu1() {
		System.out.println("--------------------ATM管理系统--------------------");
		System.out.println("\t  1.登陆    2.开户     3.退出");
		System.out.println("--------------------------------------------------");
		System.out.print("--请输入选择：");
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
			System.out.println("退出系统成功！");
			System.exit(0);
			break;
		default:
			System.out.println("输入有误，重新输入");
			mainMenu1();
			break;
		}
	}

	/** 用户登陆 */
	public boolean login() {
		boolean b = false;
		System.out.print("--输入卡号：");
		String no = sc.next();
		System.out.print("--输入密码：");
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
		System.out.println(b ? "登陆成功" : "账户或密码错误,请重新输入");
		return b;
	}

	/** 用户开户 */
	public boolean addUser() {
		boolean b = false;
		User u = new User();
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				u.setNo(i + 1);
				System.out.print("请输入身份证号码：");
				u.setShenFenZhen(sc.next());
				System.out.print("请输入密码：");
				u.setPwd(sc.next());
				users[i] = u;
				System.out.println("卡号\t余额");
				System.out.println(users[i].getNo() + "\t" + users[i].getMoney());
				b = true;
				break;
			}
		}
		System.out.println(b ? "开户成功，请登陆" : "开户失败，请重新开户");
		return b;
	}

	/** 存钱 */
	public void saveMoney() {
		System.out.print("请输入存钱的金额：");
		double d = sc.nextDouble();
		users[index].setMoney(users[index].getMoney() + d);
		System.out.println("存钱成功");
		System.out.println(users[index]);
		mainMenu();
	}

	/** 取钱 */
	public void takeMoney() {
		System.out.print("请输入取钱的金额：");
		double d = sc.nextDouble();
		if (d > users[index].getMoney()) {
			System.out.println("你并没有那么多钱。。。建议先看看余额");
		} else {
			users[index].setMoney(users[index].getMoney() - d);
		}
		System.out.println("取钱成功");
		System.out.println(users[index]);
		mainMenu();
	}

	/** 转账 */
	public void moveMoney() {
		System.out.print("请输入要转账的卡号：");
		String no = sc.next();
		for (int i = 0; i < users.length; i++) {
			if (users[i] == null) {
				System.out.println("没有该卡号");
				break;
			}
			if (users[i].getNo().equals(no)) {
				System.out.print("请输入转账金额：");
				double money = sc.nextDouble();
				if (money > users[index].getMoney()) {
					System.out.println("你并没有那么多钱。。。建议先看看余额");
				} else {
					users[index].setMoney(users[index].getMoney() - money);
					users[i].setMoney(users[i].getMoney() + money);
					System.out.println("成功向卡号"+no+" 转入金额："+money);
				}
				break;
			}
		}
		mainMenu();
	}
	/** 查余额 */
	public void getMoney() {
		System.out.println(users[index]);
		mainMenu();
	}

}
