package day16;

import java.util.HashMap;
import java.util.Map;

/**练习：Map*/
public class TestMap3 {

	public static void main(String[] args) {
		// 建立银行英文简称和中文全名间的键值映射
		Map<String,String> map = new HashMap<>();
		map.put("ICBC", "工商银行");
		map.put("PBC", "农业银行");
		map.put("BC", "中国银行");
		map.put("CBC", "建设银行");
		//集合遍历
		map.keySet().forEach(System.out::println);
		map.values().forEach(System.out::println);
		map.forEach((k,v)->System.out.println(k+"="+v));
		//根据键 获得 值
		System.out.println(map.get("BC"));
		//个数
		System.out.println(map.size());
		//删除
		map.remove("BC");
		//元素是否存在
		System.out.println(map.containsKey("BC"));
		//迭代器遍历
		map.keySet().iterator().forEachRemaining(System.out::println);
		map.values().iterator().forEachRemaining(System.out::println);
		map.entrySet().iterator().forEachRemaining(e->System.out.println(e.getKey()+"="+e.getValue()));
		
	}

}
