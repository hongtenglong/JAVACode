package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		String [] s = {"科特迪瓦", "阿根廷", "澳大利亚", "塞尔维亚", "荷兰", "尼日利亚", "日本", 
				"美国", "中国", "新西兰", "巴西", "比利时", "韩国", "喀麦隆", "洪都拉斯", "意大利", };
		List<String> list = new ArrayList<String>();
		for (String string : s) {
			list.add(string);
		}
		for (int i = 1; i <= 4; i++) {
			System.out.println("第"+i+"组：");
			for (int j = 1; j <= 4; j++) {
				int index =(int)(Math.random()*list.size());
				//System.out.println(index);
				//String str = list.get(index);
				System.out.print(list.get(index)+"   ");
				list.remove(index);
			}
			System.out.println();
		}
	}
}
