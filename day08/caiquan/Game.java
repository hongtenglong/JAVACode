package day08.caiquan;

import java.util.Scanner;

public class Game {
	int count = 0; // �ܾ���
	Person p = Person.getPerson();
	Robot r = Robot.getRobot();
	String[] choice = { "����", "ʯͷ", "��" };
	String[] name = { "�ܴ�", "��2", "��ͷǿ" };

	public void start() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*************");
		System.out.println("**��ȭ    ��ʼ**");
		System.out.println("*************");
		System.out.print("��Ϊ�Լ�ѡ���ɫ��(1.�ܴ�,  2.��2,  3.��ͷǿ):");
		p.setName(name[sc.nextInt() - 1]);
		System.out.println("�����ѡ��Ľ�ɫ�ǣ�" + p.getName());
		int juese = r.chuQuan(); // �������һ��1-3������
		System.out.println("��������ѡ��Ľ�ɫ�ǣ�" + name[juese - 1]);
		r.setName(name[juese - 1]);
		System.out.print("Ҫ��ʼ�𣿣�y/n��:");
		boolean b;// �Ƿ�ʼ��ȭ
		if (sc.next().equals("y")) {
			b = true;
		} else {
			b = false;
		}

		do {
			System.out.println("\n");
			System.out.println("���ȭ 1.����  2.ʯͷ  3.��");
			int ren = sc.nextInt();
			System.out.println("���ȭ��" + choice[ren - 1]);
			int jiqi = r.chuQuan();
			System.out.println("������ȭ��" + choice[jiqi - 1]);
			jiSuan(jiqi, ren);
			System.out.println("�Ƿ�ʼ��һ�֣���y/n��");
			b = sc.next().equals("y") ? true : false;
		} while (b);
		show();

	}

	// aΪ������ȭ bΪ�����ȭ
	public void jiSuan(int a, int b) {
		switch (b) {
		// ��������������
		case 1:
			switch (a) {
			case 1:
				System.out.println("������;֣���˥���ٺ٣������ư�");
				break;
			case 2:
				System.out.println("��������������ٺ٣���Ӯ��");
				r.setScore(r.getScore() + 1);
				break;
			case 3:
				System.out.println("�������������" + p.getName() + " ��Ӯ��");
				p.setScore(p.getScore() + 1);
				break;
			}
			count++;
			break;
		// �����ʯͷ�����
		case 2:
			switch (a) {
			case 1:
				System.out.println("�������������" + p.getName() + " ��Ӯ��");
				p.setScore(p.getScore() + 1);
				break;
			case 2:
				System.out.println("������;֣���˥���ٺ٣������ư�");
				break;
			case 3:
				System.out.println("��������������ٺ٣���Ӯ��");
				r.setScore(r.getScore() + 1);
				break;
			}
			count++;
			break;
		// ������������
		case 3:
			switch (a) {
			case 1:
				System.out.println("��������������ٺ٣���Ӯ��");
				r.setScore(r.getScore() + 1);
				break;
			case 2:
				System.out.println("�������������" + p.getName() + " ��Ӯ��");
				p.setScore(p.getScore() + 1);
				break;
			case 3:
				System.out.println("������;֣���˥���ٺ٣������ư�");
				break;
			}
			count++;
			break;
		}
	}

	public void show() {
		System.out.println();
		System.out.println("(����)" + r.getName() + " VS " + "(��)" + p.getName());
		System.out.println("     ʤ"+r.getScore() + "          ʤ" + p.getScore());
		System.out.println("��ս������" + count);

		if (r.getScore() > p.getScore()) {
			System.out.println("�����(����)" + r.getName() + "��ʤ");
		} else if (r.getScore() < p.getScore()) {
			System.out.println("�����(��)" + p.getName() + "��ʤ");
		} else {
			System.out.println("������;�");
		}
	}
}
