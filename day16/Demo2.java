package day16;

import java.util.HashMap;
import java.util.Map;

public class Demo2 {
	public static void main(String[] args) {
		Map<String, String> m = new HashMap<>();
		m.put("PBC", "ũҵ����");
		m.put("ICBC", "��������");
		m.put("BC", "�й�����");
		m.put("CBC", "��������");
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println();
		m.forEach((k,v)->{System.out.println(k+"="+v);});
		m.entrySet().iterator().forEachRemaining((e)->System.out.println(e.getKey()+"="+e.getValue()));
	}
}
