package day16;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("PBC", "农业银行");
		m.put("ICBC", "工商银行");
		m.put("BC", "中国银行");
		m.put("CBC", "建设银行");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println();
		m.forEach((k,v)->{System.out.println(k+"="+v);});
		m.entrySet().iterator().forEachRemaining((e)->System.out.println(e.getKey()+"="+e.getValue()));
	}
}
