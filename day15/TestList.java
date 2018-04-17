package day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**示例：List*/
public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		//有顺序的 ，从 0开始 编号
		//向 某个 索引位置 添加元素
		list.add(1, "xx");
		System.out.println(list);//[aa, xx, bb, cc]
		//获得 某个 索引 位置的元素
		System.out.println(list.get(2));//bb
		//替换（修改）:把索引 处的元素 用 第二 参数替换
		list.set(1, "yy");
		System.out.println(list);//[aa, yy, bb, cc]
		//
		list.add("aa");
		//[aa, yy, bb, cc, aa]
		System.out.println(list);
		//查找 参数元素 在当前集合list中第一次出现的位置索引,不存在 -1
		System.out.println(list.indexOf("aa"));//0
		//最后一次出现的位置索引
		System.out.println(list.lastIndexOf("aa"));//4
		//子集 [起始位置索引，终止位置索引) 不包括终止位置
		System.out.println(list.subList(1, 4));//yy, bb, cc,
		//List自己的sort排序
		//[aa, yy, bb, cc, aa]
		System.out.println(list);
		//自然 升序排序
		list.sort(null);
		System.out.println(list);
/*		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//降序
				return o2.compareTo(o1);
			}
		});*/
		list.sort((o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		
		
		
		
		
	}

}
