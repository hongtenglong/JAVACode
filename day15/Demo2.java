package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo2 {
	public static void main(String[] args) {
		String [] s = {"���ص���", "����͢", "�Ĵ�����", "����ά��", "����", "��������", "�ձ�", 
				"����", "�й�", "������", "����", "����ʱ", "����", "����¡", "�鶼��˹", "�����", };
		List<String> list = new ArrayList<String>();
		for (String string : s) {
			list.add(string);
		}
		for (int i = 1; i <= 4; i++) {
			System.out.println("��"+i+"�飺");
			for (int j = 1; j <= 4; j++) {
				int index =(int)(Math.random()*list.size());
				//System.out.println(index);
				//String str = list.get(index);
				System.out.print(list.get(index)+"   ");
				list.remove(index);
			}
			System.out.println();
		}
	}
}
