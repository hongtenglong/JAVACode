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
		System.out.println(i+"�������������С�������2��");
		System.out.println("����"+(int)mama+"��");
		System.out.println("С��"+(int)xiaoming+"��");
	}

}
