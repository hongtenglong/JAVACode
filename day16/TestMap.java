package day16;

import java.util.HashMap;
import java.util.Map;

/**ʾ����Map*/
public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		//��� ��ֵ��
		map.put(1, "aa");
		map.put(2, "bb");
		map.put(3, "cc");
		map.put(2, "hello");//�� Ψһ ������֮ǰ��ֵ��
		//HashMap֧�� Null���� Nullֵ
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		//---------------------------------
		//�ж� ָ���ļ� �� map���� �� �Ƿ���� 
		System.out.println(map.containsKey(3));//true
		//ֵ �Ƿ� ����
		System.out.println(map.containsValue("cc"));//true
		//ɾ�� �� �� ��Ӧ�ļ�ֵ��
		map.remove(1);
		System.out.println(map);
		//���ļ���  ���� Set
		System.out.println(map.keySet());
		//ֵ�ļ��� Collection
		System.out.println(map.values());
		//���
		map.clear();
		System.out.println(map.size());
		
	
	
	
	
	}

}
