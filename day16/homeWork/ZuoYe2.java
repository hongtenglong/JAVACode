package day16.homeWork;

import java.util.HashMap;
import java.util.Map;

public class ZuoYe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> ht = new HashMap<>();
		ht.put("CA", "���ô�(CANADA)");
		ht.put("CF", "�з�(CENTRAL AFRICA) ");
		ht.put("CG", "�չ�(CONGO)");
		ht.put("CH", "��ʿ(SWITZERLAND)");
		ht.put("CL", "����(CHILE)");
		ht.put("CM", "����¡(CAMEROON)");
		ht.put("CN", "�й�(CHINA)");
		if(ht.containsKey("CA")) {
			System.out.println("CA-"+ht.get("CA"));
		}else {
			System.out.println("�޴˹���");
		}
		System.out.println("������һ����"+ht.size()+"������");
		
		ht.keySet().forEach(System.out::println);
		
		ht.values().forEach(System.out::println);
		
	}

}
