package day15;

import java.util.HashSet;
import java.util.Set;

/**��ϰ��Set*/
public class TestSet2 {

	public static void main(String[] args) {
		/*
		 * ���(1~30�м�)����7���������ע�ⲻ���ظ�
		 */
		Set<Integer> set = new HashSet<>();
		int r;
		
		while(true) {
			r = (int)(Math.random()*(30-1+1)+1);
			set.add(r);//int->Integer
			if(set.size() == 7) {
				break;
			}
		}
		System.out.println(set);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
