package day12;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String username, password;
		int i = 1;
		for (; i <= 3; i++) {
			System.out.print("�������û�����");
			username = sc.next();
			System.out.print("���������룺");
			password = sc.next();
			if (username.equals("htl") && password.equals("abc")) {
				System.out.println("��ӭ��½MyShoppingϵͳ");
				break;
			} else {
				System.out.println("�������������" + (3-i) + "�λ��ᣡ");
			}
		}
		if(i>3) {
			System.out.println("�Բ�����3�ξ��������!");
		}
	}

}
