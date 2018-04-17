package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**练习：List*/
public class TestList2 {

	public static void main(String[] args) {
		/*
		 * 十六只球队 ，随机分成4组
		 */
		List<String> list = new ArrayList<>();
		list.add("科特迪瓦");
		list.add("阿根廷");
		list.add("澳大利亚");
		list.add("塞尔维亚");
		list.add("荷兰");
		list.add("尼日利亚");
		list.add("日本");
		list.add("美国");
		list.add("中国");
		list.add("新西兰");
		list.add("巴西");
		list.add("比利时");
		list.add("韩国");
		list.add("喀麦隆");
		list.add("洪都拉斯");
		list.add("意大利");
//		System.out.println(list.size());
		Random r = new Random();
		//r.nextInt(上限);  【0，上限) [0,list.size()）
		String str = null;
		for(int i = 0; i < 4; i++) {
			System.out.println("第"+(i+1)+"组：");
			for(int j = 0; j < 4; j++) {
				str = list.get(r.nextInt(list.size()));
				System.out.print(str+"  ");
				list.remove(str);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
