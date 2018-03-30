package day04.homeWork;

public class ZuoYe3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] i = {1,2,3,4,5,6};
		int [] ji = new int[6];  //奇数数组
		int [] ou = new int[6];  //偶数数组
		for (int j : i) {
			if(j%2==0) {
				for(int n = 0; n < 6; n++) {
					if(ou[n]==0) {
						ou[n]=j;
						break;
					}
				}
			}else {
				for(int n = 0; n < 6; n++) {
					if(ji[n]==0) {
						ji[n]=j;
						break;
					}
				}
			}
		}
		System.out.print("偶数数组：");
		for (int j : ou) {
			if(j!=0) {
				System.out.print(j+" ");
			}
		}
		System.out.println();
		System.out.print("奇数数组：");
		for (int j : ji) {
			if(j!=0) {
			System.out.print(j+" ");
			}
		}
	}

}
