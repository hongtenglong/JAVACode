package day16;

import java.util.HashMap;
import java.util.Map;

/**示例：Map*/
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		//添加 键值对
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(2, "hello");//键 唯一 （覆盖之前的值）
		//HashMap支持 Null键和 Null值
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		//---------------------------------
		//判断 指定的键 在 map集合 中 是否存在 
		System.out.println(map.containsKey(3));//true
		//值 是否 存在
		System.out.println(map.containsValue("cc"));//true
		//删除 此 键 对应的键值对
		map.remove(1);
		System.out.println(map);
		//键的集合  类型 Set
		System.out.println(map.keySet());
		//值的集合 Collection
		System.out.println(map.values());
		//清空
		map.clear();
		System.out.println(map.size());
		
	
	
	
	
	}

}
