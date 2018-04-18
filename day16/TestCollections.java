package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**示例：Collections方法*/
public class TestCollections {

	public static void main(String[] args) {
		// Collections
		List<String> list = new ArrayList<>();
//		list.add("aa");
//		list.add("bb");
		//一次性添加 多个元素，用逗号分隔
		Collections.addAll(list, "bb","aa","cc");
		System.out.println(list);
		//自然 comparable
		Collections.sort(list);//"aa","bb","cc"
		//指定比较器
//		Collections.sort(list, (s1,s2)->s2.compareTo(s1));
		System.out.println(list);
		//集合中的元素 在 集合中的 位置索引，不存在 -插入点 - 1(前提：升序排序)
		System.out.println(Collections.binarySearch(list, "aa"));//0
		//最小的元素 和 最大的元素
		System.out.println(Collections.min(list));//"aa"
		System.out.println(Collections.max(list));//"cc"
		
		//
		Collections.addAll(list, "aa","aa","ee");
		System.out.println(list);
		//集合 元素 在集合中出现的次数
		System.out.println(Collections.frequency(list, "aa"));//3
		//反转集合的元素
		Collections.reverse(list);
		System.out.println(list);
		//填充集合
		Collections.fill(list, "hello");
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
