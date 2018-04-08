package day08.caiquan;

import java.util.Scanner;

public class Game {
	int count = 0; // 总局数
	Person p = Person.getPerson();
	Robot r = Robot.getRobot();
	String[] choice = { "剪刀", "石头", "布" };
	String[] name = { "熊大", "熊2", "光头强" };

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*************");
		System.out.println("**猜拳    开始**");
		System.out.println("*************");
		System.out.print("请为自己选择角色：(1.熊大,  2.熊2,  3.光头强):");
		p.setName(name[sc.nextInt() - 1]);
		System.out.println("你随机选择的角色是：" + p.getName());
		int juese = r.chuQuan(); // 随机生成一个1-3的数字
		System.out.println("计算机随机选择的角色是：" + name[juese - 1]);
		r.setName(name[juese - 1]);
		System.out.print("要开始吗？（y/n）:");
		boolean b;// 是否开始猜拳
		if (sc.next().equals("y")) {
			b = true;
		} else {
			b = false;
		}

		do {
			System.out.println("\n");
			System.out.println("请出拳 1.剪刀  2.石头  3.布");
			int ren = sc.nextInt();
			System.out.println("你出拳：" + choice[ren - 1]);
			int jiqi = r.chuQuan();
			System.out.println("机器出拳：" + choice[jiqi - 1]);
			jiSuan(jiqi, ren);
			System.out.println("是否开始下一轮：（y/n）");
			b = sc.next().equals("y") ? true : false;
		} while (b);
		show();

	}

	// a为机器出拳 b为人类出拳
	public void jiSuan(int a, int b) {
		switch (b) {
		// 人类出剪刀情况下
		case 1:
			switch (a) {
			case 1:
				System.out.println("结果：和局，真衰！嘿嘿，等着瞧吧");
				break;
			case 2:
				System.out.println("结果（机器）：嘿嘿，我赢了");
				r.setScore(r.getScore() + 1);
				break;
			case 3:
				System.out.println("结果（机器）：" + p.getName() + " 你赢了");
				p.setScore(p.getScore() + 1);
				break;
			}
			count++;
			break;
		// 人类出石头情况下
		case 2:
			switch (a) {
			case 1:
				System.out.println("结果（机器）：" + p.getName() + " 你赢了");
				p.setScore(p.getScore() + 1);
				break;
			case 2:
				System.out.println("结果：和局，真衰！嘿嘿，等着瞧吧");
				break;
			case 3:
				System.out.println("结果（机器）：嘿嘿，我赢了");
				r.setScore(r.getScore() + 1);
				break;
			}
			count++;
			break;
		// 人类出布情况下
		case 3:
			switch (a) {
			case 1:
				System.out.println("结果（机器）：嘿嘿，我赢了");
				r.setScore(r.getScore() + 1);
				break;
			case 2:
				System.out.println("结果（机器）：" + p.getName() + " 你赢了");
				p.setScore(p.getScore() + 1);
				break;
			case 3:
				System.out.println("结果：和局，真衰！嘿嘿，等着瞧吧");
				break;
			}
			count++;
			break;
		}
	}

	public void show() {
		System.out.println();
		System.out.println("(机器)" + r.getName() + " VS " + "(人)" + p.getName());
		System.out.println("     胜"+r.getScore() + "          胜" + p.getScore());
		System.out.println("对战次数：" + count);

		if (r.getScore() > p.getScore()) {
			System.out.println("结果：(机器)" + r.getName() + "获胜");
		} else if (r.getScore() < p.getScore()) {
			System.out.println("结果：(人)" + p.getName() + "获胜");
		} else {
			System.out.println("结果：和局");
		}
	}
}
