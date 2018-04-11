package day11.homeWork;

interface Rent {
	void rent();
}

class ZhongJie implements Rent {
	@Override
	public void rent() {
		System.out.println("�н鿪ʼ�����ⷿ...");
		class FangDong implements Rent {
			@Override
			public void rent() {
				System.out.println("����������ʼ���н��ⷿ...");
			}
		}
		new FangDong().rent();
		System.out.println("�н�������...");
	}
}

interface ZhongJie1 extends Rent {
	public abstract void rent();
}

interface FangDong1 extends Rent {
	public abstract void rent();
}

public class ZuoYe5 {
	public static void main(String[] args) {
		System.out.println("ʵ����ķ�ʽ...");
		ZhongJie z1 = new ZhongJie();
		z1.rent();
		System.out.println("--------------------------");

		System.out.println("������ķ�ʽ...");
		FangDong1 f2 = new FangDong1() {

			@Override
			public void rent() {
				System.out.println("����������ʼ���н��ⷿ...");

			}
		};
		ZhongJie1 z2 = new ZhongJie1() {
			@Override
			public void rent() {
				System.out.println("�н鿪ʼ�����ⷿ...");
				f2.rent();
				System.out.println("�н�������...");
			}
		};
		z2.rent();
		System.out.println("--------------------------");
		System.out.println("lambda ���ʽ�ķ�ʽ");
		FangDong1 f3 = ()->{System.out.println("����������ʼ���н��ⷿ...");};
		ZhongJie1 z3 = () ->{
			System.out.println("�н鿪ʼ�����ⷿ...");
			f3.rent();
			System.out.println("�н�������...");
		};
		z3.rent();
	}
}
