package day04.homeWork;

import java.util.Scanner;

public class ZuoYe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] no = new int[100];
		String [] name = new String[100];
		double [] price = new double[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("****************�˵�****************");
		System.out.println("1.��ӣ�2.�޸ģ�3.ɾ����4.��ѯ��5.�˳�");
		System.out.println("************************************");
		int i ;
		do {
			System.out.print("--������ѡ��:");
			i = sc.nextInt();
			switch(i) {
			case 1:
				System.out.print("����ͼ���ţ�");
				int a = sc.nextInt();
				System.out.print("����ͼ�����ƣ�");
				String b = sc.next();
				System.out.print("����ͼ��۸�");
				double c = sc.nextDouble();
				for(int d =0;i<no.length;d++) {
					if(no[d] == 0) {
						no[d] = a;
						name[d] = b;
						price[d] = c;
						break;
					}
				}
				System.out.println("��ӳɹ�");
				break;
			case 2:
				System.out.print("����Ҫ�޸ĵ�ͼ���ţ�");
				int a2 = sc.nextInt();
				for(int d = 0;d<no.length;d++ ) {
					if(a2 == no[d]){
						System.out.print("����Ҫ�µ�ͼ�����ƣ�");
						String b2 = sc.next();
						System.out.print("����Ҫ�µ�ͼ��۸�");
						double c2 = sc.nextDouble();
						name[d] = b2;
						price[d] = c2;
						System.out.println("�޸ĳɹ�");
					}else if(no[d]==0) {
						System.out.println("û�и�ͼ����");
						break;
					}
				}
				break;
			case 3:
				System.out.print("����Ҫɾ����ͼ���ţ�");
				int a3 = sc.nextInt();
				for(int d = 0;d<no.length;d++ ) {
					if(a3 == no[d]){
						for(int e = d;e<no.length-1;e++){
							//���Ч��
							if(no[e]==0)
								break;
							no[e] = no[e+1];
						}
						System.out.println("ɾ���ɹ�");
						break;
					}else if(no[d]==0) {
						System.out.println("û�и�ͼ����");
						break;
					}
				}
				break;
			case 4:
				System.out.println("���\t����\t�۸�");
				for(int d = 0;d<no.length;d++ ) {
					if(no[d]!=0) {
						System.out.println(no[d]+"\t"+name[d]+"\t"+price[d]);
					}else {
						break;
					}
				}
				break;
			case 5:
				System.out.println("�˳��ɹ�");
				System.exit(0);
			default:
				System.out.println("�����������������");
				System.out.println("****************�˵�****************");
				System.out.println("1.��ӣ�2.�޸ģ�3.ɾ����4.��ѯ��5.�˳�");
				System.out.println("************************************");
			}
		}while(i!=5);
		
	}

}
