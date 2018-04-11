package day11.homeWork;

interface Rent {
	void rent();
}

class ZhongJie implements Rent {
	@Override
	public void rent() {
		System.out.println("中介开始代理租房...");
		class FangDong implements Rent {
			@Override
			public void rent() {
				System.out.println("张三房东开始找中介租房...");
			}
		}
		new FangDong().rent();
		System.out.println("中介代理结束...");
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
		System.out.println("实现类的方式...");
		ZhongJie z1 = new ZhongJie();
		z1.rent();
		System.out.println("--------------------------");

		System.out.println("匿名类的方式...");
		FangDong1 f2 = new FangDong1() {

			@Override
			public void rent() {
				System.out.println("张三房东开始找中介租房...");

			}
		};
		ZhongJie1 z2 = new ZhongJie1() {
			@Override
			public void rent() {
				System.out.println("中介开始代理租房...");
				f2.rent();
				System.out.println("中介代理结束...");
			}
		};
		z2.rent();
		System.out.println("--------------------------");
		System.out.println("lambda 表达式的方式");
		FangDong1 f3 = ()->{System.out.println("张三房东开始找中介租房...");};
		ZhongJie1 z3 = () ->{
			System.out.println("中介开始代理租房...");
			f3.rent();
			System.out.println("中介代理结束...");
		};
		z3.rent();
	}
}
