package day12;

import java.util.Arrays;
import java.util.function.IntConsumer;

/**ʾ����String*/
public class TestDemo{
	public static void main(String[] args) {
		//String 
		String s =  new String("hello");
		String s1 = "hello";
		String s2 = "hello";
		String s3 = "abc";
		String s4 = new String("hello");
		//��ַ
		System.out.println(s == s2);
		System.out.println(s == s3);
		System.out.println(s == s1);
		System.out.println(s1 == s4);
		
		//���ɱ�
		String str = "hello";
		//׷�� �ַ���
//		System.out.println(str.concat("tom"));//"hellotom"
		str = str.concat("tom");
		str = "abc";
		System.out.println(str);//"abc"
		//----------------------------------------------
		String str1 = "hello";
		//���� ����
		System.out.println(str1.length());//5
/*		String sn = "12456";
		System.out.println(sn.length());//3
*/	
		//equals�ַ����У�ֵ����� ���ִ�Сд
		System.out.println(str1.equals("hello"));//true
		System.out.println(str1.equals("HellO"));//false
		
		//��Сд����
		System.out.println(str1.equalsIgnoreCase("HellO"));//true
		//��д
		System.out.println(str1.toUpperCase());//"HELLO"
		//Сд
		System.out.println(str1.toLowerCase());//"hello"
		// zhangs@163.com
		//             0
		String str2 = "hellohello he";
		//λ��  �����ַ��� �� ��ǰ�ַ���str2�е�һ�γ��ֵ�λ������
		System.out.println(str2.indexOf("he"));//0
		//���һ�γ��ֵ�λ������
		System.out.println(str2.lastIndexOf("he"));//11
		//������  ���� -1
		System.out.println(str2.lastIndexOf("haha"));//-1
		String str3 = "hellotom";
		//��� ָ��λ�õ�һ���ַ�char superman.next().charAt(0);
		System.out.println(str3.charAt(5));//'t'
		//ȡ�Ӵ�
		//���� �� ��ʼλ�� ���� ��ʼλ�� ȡ ����� [��ʼλ��,ĩβ]
		System.out.println(str3.substring(5));//"tom"
		// [��ʼλ��,��ֹλ��)  ������ ��ֹλ��
		System.out.println(str3.substring(2, 4));//"ll"
		//trimǰ �� �ո�
		String str4 = "      h e l l o    ";
		System.out.println(str4.trim());
		//�滻�� ��2 �������� �ַ��� �滻 ��1 ���������ַ���;
		System.out.println(str4.replace("l", "xx"));
		//�� �ַ��� �� ���еĿո�ȥ��
		System.out.println(str4.replace(" ", ""));//""
		//
		String str5 = "Demo.java";
		//��  ���� �ַ��� Ϊ��β��  ,��� true
		System.out.println(str5.endsWith("java"));//true
		//�Բ��� �ַ��� Ϊ ��ͷ ,�� ��� true
		System.out.println(str5.startsWith("Demo"));
		//
		String str6 = "zabc";
		String str7 = "zabc";
		//��ǰ �ַ�������str6 �� �����ַ�������str7��ǰ��  ������ ����
		//��ǰ �ַ�������str6 �� �����ַ�������str7�ĺ�ߣ����� ����
		//��ͬ���� 0
		System.out.println(str6.compareTo(str7));
		//
		String str8 = "hello";
		char [] cs = str8.toCharArray();
	/*	for(char c:cs) {
			System.out.println("Ԫ���ǣ�"+c);
		}*/
	/*	int [] n = {3,4,5,6};
		Arrays.stream(n).forEach(System.out::println);*/
		//�ָ��ַ��� ���ò����ַ��� �ָ� ��ǰ�ַ��� ���� Ϊһ���ַ�������
		String str9 = "aab b cc dd ee ff";
		String [] strs = str9.split(" ");
		for(String sx : strs) {
			System.out.println(sx);
		}
		//�����ַ���  �ڵ�ǰ�ַ����������Ƿ�������� true
		System.out.println(str9.contains("cc"));//true
		
	}

}

