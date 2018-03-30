package day04;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xiaoming = 12;
		double mama = xiaoming+20;
		int i = 0;
		while(mama/xiaoming != 2) {
			xiaoming ++;
			mama ++;
			i++;
		}
		System.out.println(i+"年后妈妈年龄是小明年龄的2倍");
		System.out.println("妈妈"+(int)mama+"岁");
		System.out.println("小明"+(int)xiaoming+"岁");
	}

}
