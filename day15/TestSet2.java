package day15;

import java.util.HashSet;
import java.util.Set;

/**练习：Set*/
public class TestSet2 {

	public static void main(String[] args) {
		/*
		 * 随机(1~30中间)生成7个随机数，注意不能重复
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
