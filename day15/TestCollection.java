package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
/**ʾ����Collection*/
public class TestCollection {

	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		//�ж� ���� �Ƿ�Ϊ��  true�յ� ��������û��Ԫ�أ�
		System.out.println(c.isEmpty());
		//��� Ԫ�� ����ӳɹ� true
		c.add("aa");
		c.add("bb");
		c.add("cc");
		System.out.println(c);
		System.out.println(c.isEmpty());
		//������ Ԫ�� �ĸ���
		System.out.println(c.size());
		//c1����
		Collection<String> c1 = new ArrayList<String>();
		c1.add("dd");
		c1.add("ee");
		//�� c1���� �е�����Ԫ����ӵ� c�����У�ֻҪ���ϸı�true
		c.addAll(c1);
		System.out.println(c);
		//ɾ�������е�һ������
		c.remove("aa");
		c.remove("bb");
		System.out.println(c);
		//ɾ�� ���� c1�е�����Ԫ��
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
		//�������� ɾ��
		c.removeIf(t->t.length() == 4);
		System.out.println(c);
		//�鿴 ���� Ԫ�� �ڼ������Ƿ���� ������true
		System.out.println(c.contains("cc"));//true
		System.out.println(c.contains("xyz"));//false
		//�鿴 ���������е�Ԫ�� �ڵ�ǰ����c���Ƿ���������� true
		System.out.println(c.containsAll(c1));//false
		//�������飬
		String [] str = new String[] {"cc","xx"};
		//������ת���ɼ��� ArrayList�� Arrays���ڲ��࣬������ֻ���������� 
		List<String> c2 = Arrays.asList(str);
		System.out.println(c.containsAll(c2));//true
		//���� ת ����
		System.out.println(c);//[cc, xx]
//		Object [] arr = c.toArray();
		//���� ���� ������ �洢 ���� �е�Ԫ�صģ����� �� ������Ԫ��С���Զ�����
		//                                    ����null���
		Object [] arr = c.toArray(new Object[0]);
		//��������
		String [] arr1 = c.toArray(new String[0]);
		System.out.println(Arrays.toString(arr1));
		
		//��������е�����Ԫ��
		c.clear();
		System.out.println(c.isEmpty());//true
		System.out.println(c.size());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
