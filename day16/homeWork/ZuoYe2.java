package day16.homeWork;

import java.util.HashMap;
import java.util.Map;

public class ZuoYe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ht = new HashMap<>();
		ht.put("CA", "加拿大(CANADA)");
		ht.put("CF", "中非(CENTRAL AFRICA) ");
		ht.put("CG", "刚果(CONGO)");
		ht.put("CH", "瑞士(SWITZERLAND)");
		ht.put("CL", "智利(CHILE)");
		ht.put("CM", "喀麦隆(CAMEROON)");
		ht.put("CN", "中国(CHINA)");
		if(ht.containsKey("CA")) {
			System.out.println("CA-"+ht.get("CA"));
		}else {
			System.out.println("无此国家");
		}
		System.out.println("集合中一共有"+ht.size()+"个国家");
		
		ht.keySet().forEach(System.out::println);
		
		ht.values().forEach(System.out::println);
		
	}

}
