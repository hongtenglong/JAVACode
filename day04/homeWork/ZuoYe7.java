package day04.homeWork;

public class ZuoYe7 {

	public static void main(String[] args) {
		int [] oldArr = new int[100];
		int [] newArr = new int[98];
		int i1 = (int)(Math.random()*100);//0-99的随机数
		int i2 = (int)(Math.random()*99);//0-98的随机数
		//生成1-100的数组
		for(int i = 1;i<=100;i++) {
			oldArr[i-1] = i;
		}
		//将数组在i1位置往前挪一位
		for(int i =i1;i<100;i++) {
			oldArr[i-1] = oldArr[i];
		}
		//将数组在i2位置往前挪一位
		for(int i =i2;i<99;i++) {
			oldArr[i-1] = oldArr[i];
		}
		for(int i =0;i<98;i++) {
			newArr[i] = oldArr[i];
		}
		
		//遍历数组
		for (int i : newArr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		for (int i =1;i<=100;i++) {
			for (int j : newArr) {
				if(i==j) {
					break;
				}else if(j==newArr[97]){
					System.out.println(i+"不存在数组里");
				}
			}
		}
	}

}
