package day04.homeWork;

public class ZuoYe6 {

	public static void main(String[] args) {
		int oldArr[]={1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5} ;
		int num = 0;  //newArr µÄ³¤¶È
		for (int i : oldArr) {
			if(i!=0) {
				num ++;
			}
		}
		int [] newArr = new int[num];
		for (int i : oldArr) {
			if(i!=0) {
				for(int j =0;j<newArr.length;j++) {
					if(newArr[j] == 0) {
						newArr[j] = i;
						break;
					}
				}
			}
		}
		
		for (int i : newArr) {
			System.out.print(i+",");
		}
	}

}
