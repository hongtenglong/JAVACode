package day12;

public class TestInteger {

	public static void main(String[] args) {
	
		//װ�� ����������  ��װ �� ������
		int n = 55;
		Integer i = new Integer(n);//int  - > Integer
		i = Integer.valueOf(n);
		
		i = n;//�Զ�װ�� Integer.valueOf(n);
		
		//����   ������  �����е�  ֵȡ����   Integer - > int 
		n =  i.intValue();//
		n = i;//�Զ����� i.intValue();
		
		//-------------------------------------------
		//���� Float �� Double ���⣬������ 6��  ��ʵ���� �����صļ��������ڴ����л���
		//  ֻ  ���� �� -128  �� 127
		Integer num1 = 22;
		Integer num2 = 22;
		
		System.out.println(num1 == num2);
		
		Integer num3 = 222;// Integer num3 = new Integer(222);
		Integer num4 = 222;
		System.out.println(num3 == num4);//false
		
		//---------------------����---------------------------------
		//�鿴 �������͵� ���� �� ����
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		//����ת��
		// String ->  int
		String s = "123";
		int number1 = Integer.parseInt(s);//����
		number1 = Integer.valueOf(s);
		number1 = new Integer(s).intValue();
		
		//int - > String
		s = number1 + "";//����
		s = Integer.toString(number1);
		s = String.valueOf(number1);
		
		// ����ת��
		System.out.println(Integer.toBinaryString(5));// 10 - > 2
		System.out.println(Integer.toHexString(15));// 10 - > 16
		System.out.println(Integer.toOctalString(5));// 10 - > 8
		System.out.println(Integer.valueOf("101",2));// 2 - > 10
		System.out.println(Integer.valueOf("17", 8));// 8 -> 10
		System.out.println(Integer.valueOf("f", 16));// 16 - > f
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
