package day16;

import java.util.HashMap;
import java.util.Map;

/**��ϰ��Map*/
public class TestMap3 {

	public static void main(String[] args) {
		// ��������Ӣ�ļ�ƺ�����ȫ����ļ�ֵӳ��
		Map<String,String> map = new HashMap<>();
		map.put("ICBC", "��������");
		map.put("PBC", "ũҵ����");
		map.put("BC", "�й�����");
		map.put("CBC", "��������");
		//���ϱ���
		map.keySet().forEach(System.out::println);
		map.values().forEach(System.out::println);
		map.forEach((k,v)->System.out.println(k+"="+v));
		//���ݼ� ��� ֵ
		System.out.println(map.get("BC"));
		//����
		System.out.println(map.size());
		//ɾ��
		map.remove("BC");
		//Ԫ���Ƿ����
		System.out.println(map.containsKey("BC"));
		//����������
		map.keySet().iterator().forEachRemaining(System.out::println);
		map.values().iterator().forEachRemaining(System.out::println);
		map.entrySet().iterator().forEachRemaining(e->System.out.println(e.getKey()+"="+e.getValue()));
		
	}

}
