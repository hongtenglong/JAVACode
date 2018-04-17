package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
/**示例：Collection*/
public class TestCollection {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		//判断 集合 是否为空  true空的 （集合中没有元素）
		System.out.println(c.isEmpty());
		//添加 元素 ，添加成功 true
		c.add("aa");
		c.add("bb");
		c.add("cc");
		System.out.println(c);
		System.out.println(c.isEmpty());
		//集合中 元素 的个数
		System.out.println(c.size());
		//c1集合
		Collection<String> c1 = new ArrayList<String>();
		c1.add("dd");
		c1.add("ee");
		//把 c1集合 中的所有元素添加到 c集合中，只要集合改变true
		c.addAll(c1);
		System.out.println(c);
		//删除集合中的一个对象
		c.remove("aa");
		c.remove("bb");
		System.out.println(c);
		//删除 集合 c1中的所有元素
		c.removeAll(c1);
		System.out.println(c);
		//
		c.add("aaaa");
		c.add("xx");
		c.add("yyyy");
		System.out.println(c);//[cc, aaaa, xx, yyyy]
	/*	c.removeIf(new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.length() == 2;
			}
		});*/
		//按照条件 删除
		c.removeIf(t->t.length() == 4);
		System.out.println(c);
		//查看 参数 元素 在集合中是否包含 ，存在true
		System.out.println(c.contains("cc"));//true
		System.out.println(c.contains("xyz"));//false
		//查看 参数集合中的元素 在当前集合c中是否包含，存在 true
		System.out.println(c.containsAll(c1));//false
		//创建数组，
		String [] str = new String[] {"cc","xx"};
		//把数组转换成集合 ArrayList是 Arrays的内部类，定长的只能用来遍历 
		List<String> c2 = Arrays.asList(str);
		System.out.println(c.containsAll(c2));//true
		//集合 转 数组
		System.out.println(c);//[cc, xx]
//		Object [] arr = c.toArray();
		//参数 数组 是用来 存储 集合 中的元素的，数组 比 集合中元素小，自动扩容
		//                                    大，用null填充
		Object [] arr = c.toArray(new Object[0]);
		//保留类型
		String [] arr1 = c.toArray(new String[0]);
		System.out.println(Arrays.toString(arr1));
		
		//清除集合中的所有元素
		c.clear();
		System.out.println(c.isEmpty());//true
		System.out.println(c.size());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
