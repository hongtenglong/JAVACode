package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**��ϰ��List*/
public class TestList2 {

	public static void main(String[] args) {
		/*
		 * ʮ��ֻ��� ������ֳ�4��
		 */
		List<String> list = new ArrayList<>();
		list.add("���ص���");
		list.add("����͢");
		list.add("�Ĵ�����");
		list.add("����ά��");
		list.add("����");
		list.add("��������");
		list.add("�ձ�");
		list.add("����");
		list.add("�й�");
		list.add("������");
		list.add("����");
		list.add("����ʱ");
		list.add("����");
		list.add("����¡");
		list.add("�鶼��˹");
		list.add("�����");
//		System.out.println(list.size());
		Random r = new Random();
		//r.nextInt(����);  ��0������) [0,list.size()��
		String str = null;
		for(int i = 0; i < 4; i++) {
			System.out.println("��"+(i+1)+"�飺");
			for(int j = 0; j < 4; j++) {
				str = list.get(r.nextInt(list.size()));
				System.out.print(str+"  ");
				list.remove(str);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
