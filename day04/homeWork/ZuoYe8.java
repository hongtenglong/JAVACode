package day04.homeWork;

import java.util.Scanner;

public class ZuoYe8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] no = new int[100];
		String [] name = new String[100];
		double [] price = new double[100];
		Scanner sc = new Scanner(System.in);
		System.out.println("****************菜单****************");
		System.out.println("1.添加；2.修改；3.删除；4.查询；5.退出");
		System.out.println("************************************");
		int i ;
		do {
			System.out.print("--请输入选择:");
			i = sc.nextInt();
			switch(i) {
			case 1:
				System.out.print("输入图书编号：");
				int a = sc.nextInt();
				System.out.print("输入图书名称：");
				String b = sc.next();
				System.out.print("输入图书价格：");
				double c = sc.nextDouble();
				for(int d =0;i<no.length;d++) {
					if(no[d] == 0) {
						no[d] = a;
						name[d] = b;
						price[d] = c;
						break;
					}
				}
				System.out.println("添加成功");
				break;
			case 2:
				System.out.print("输入要修改的图书编号：");
				int a2 = sc.nextInt();
				for(int d = 0;d<no.length;d++ ) {
					if(a2 == no[d]){
						System.out.print("输入要新的图书名称：");
						String b2 = sc.next();
						System.out.print("输入要新的图书价格：");
						double c2 = sc.nextDouble();
						name[d] = b2;
						price[d] = c2;
						System.out.println("修改成功");
					}else if(no[d]==0) {
						System.out.println("没有该图书编号");
						break;
					}
				}
				break;
			case 3:
				System.out.print("输入要删除的图书编号：");
				int a3 = sc.nextInt();
				for(int d = 0;d<no.length;d++ ) {
					if(a3 == no[d]){
						for(int e = d;e<no.length-1;e++){
							//提高效率
							if(no[e]==0)
								break;
							no[e] = no[e+1];
						}
						System.out.println("删除成功");
						break;
					}else if(no[d]==0) {
						System.out.println("没有该图书编号");
						break;
					}
				}
				break;
			case 4:
				System.out.println("编号\t名称\t价格");
				for(int d = 0;d<no.length;d++ ) {
					if(no[d]!=0) {
						System.out.println(no[d]+"\t"+name[d]+"\t"+price[d]);
					}else {
						break;
					}
				}
				break;
			case 5:
				System.out.println("退出成功");
				System.exit(0);
			default:
				System.out.println("输入错误，请重新输入");
				System.out.println("****************菜单****************");
				System.out.println("1.添加；2.修改；3.删除；4.查询；5.退出");
				System.out.println("************************************");
			}
		}while(i!=5);
		
	}

}
