package day15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**ʾ����List*/
public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		System.out.println(list);
		//��˳��� ���� 0��ʼ ���
		//�� ĳ�� ����λ�� ���Ԫ��
		list.add(1, "xx");
		System.out.println(list);//[aa, xx, bb, cc]
		//��� ĳ�� ���� λ�õ�Ԫ��
		System.out.println(list.get(2));//bb
		//�滻���޸ģ�:������ ����Ԫ�� �� �ڶ� �����滻
		list.set(1, "yy");
		System.out.println(list);//[aa, yy, bb, cc]
		//
		list.add("aa");
		//[aa, yy, bb, cc, aa]
		System.out.println(list);
		//���� ����Ԫ�� �ڵ�ǰ����list�е�һ�γ��ֵ�λ������,������ -1
		System.out.println(list.indexOf("aa"));//0
		//���һ�γ��ֵ�λ������
		System.out.println(list.lastIndexOf("aa"));//4
		//�Ӽ� [��ʼλ����������ֹλ������) ��������ֹλ��
		System.out.println(list.subList(1, 4));//yy, bb, cc,
		//List�Լ���sort����
		//[aa, yy, bb, cc, aa]
		System.out.println(list);
		//��Ȼ ��������
		list.sort(null);
		System.out.println(list);
/*		list.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				//����
				return o2.compareTo(o1);
			}
		});*/
		list.sort((o1,o2)->o2.compareTo(o1));
		System.out.println(list);
		
		
		
		
		
	}

}
