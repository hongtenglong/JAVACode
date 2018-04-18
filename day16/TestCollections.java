package day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**ʾ����Collections����*/
public class TestCollections {

	public static void main(String[] args) {
		// Collections
		List<String> list = new ArrayList<>();
//		list.add("aa");
//		list.add("bb");
		//һ������� ���Ԫ�أ��ö��ŷָ�
		Collections.addAll(list, "bb","aa","cc");
		System.out.println(list);
		//��Ȼ comparable
		Collections.sort(list);//"aa","bb","cc"
		//ָ���Ƚ���
//		Collections.sort(list, (s1,s2)->s2.compareTo(s1));
		System.out.println(list);
		//�����е�Ԫ�� �� �����е� λ�������������� -����� - 1(ǰ�᣺��������)
		System.out.println(Collections.binarySearch(list, "aa"));//0
		//��С��Ԫ�� �� ����Ԫ��
		System.out.println(Collections.min(list));//"aa"
		System.out.println(Collections.max(list));//"cc"
		
		//
		Collections.addAll(list, "aa","aa","ee");
		System.out.println(list);
		//���� Ԫ�� �ڼ����г��ֵĴ���
		System.out.println(Collections.frequency(list, "aa"));//3
		//��ת���ϵ�Ԫ��
		Collections.reverse(list);
		System.out.println(list);
		//��伯��
		Collections.fill(list, "hello");
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
