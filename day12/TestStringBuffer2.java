package day12;

import java.util.Scanner;

/**��ϰ��StringBuffer*/
public class TestStringBuffer2 {

	public static void main(String[] args) {
		/*
		 * ѭ������ѧԱ�����������롱q�������󣬽����е����������
		 */
/*		Scanner input = new Scanner(System.in);
		String name;
//		String str = "";//�մ�
		StringBuffer sf = new StringBuffer();
		do {
			System.out.println("�������֣�");
			name = input.next();
			if(name.equals("q")) {
				break;
			}
			sf.append(name);
//			str += name;// str = str + name;
			
		}while(!name.equals("q"));
		System.out.println(sf);*/
		
		//����
//		String s = "";
		StringBuffer s = new StringBuffer();
		//��ʼʱ��
		long start = System.currentTimeMillis();//����ֵ 1970 - 1-1 0��0��0 
		for(int i = 1; i <= 10000; i ++) {
//			s += i;// s = s + i;
			s.append(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);//
	}

}
