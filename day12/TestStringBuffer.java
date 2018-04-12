package day12;

public class TestStringBuffer {

	public static void main(String[] args) {
		//string ���ɱ�
	/*	String s = "hello";
		s = s.concat("tom");// "hellotom"
		System.out.println(s);//"hello"
*/
		// StringBuffer StringBuilder
		//�ɱ��ַ�����
		StringBuffer sf = new StringBuffer();
		System.out.println(sf.capacity());//���� 16
		//�ַ��� ��ĩβ ׷�� �ַ�������

		StringBuffer sf1 = new StringBuffer(100);//�������
		sf1.append("hello");
		System.out.println(sf1.capacity());//100
		//��С ���� Ϊ ��ӵ��ַ����ĳ���
		sf1.trimToSize();
		System.out.println(sf1.capacity());//5
		
		//���
		char [] cs = {'a','b','c','d','e'};
		//
		sf1.append(cs, 1, 2);//"hellobc"
		System.out.println(sf1);
		//����
		sf1.insert(5, "���");//"hello���bc"
		System.out.println(sf1);
		//�޸�  �޸� ָ������λ��  �� �ַ� Ϊ ��2�� �������ַ�
		sf1.setCharAt(5, '��');//��hello����bc"
		System.out.println(sf1);
		//ɾ��  ɾ�� ָ������ λ�� ���ַ�
		sf1.deleteCharAt(5);// ��hello��bc"
		System.out.println(sf1);
		//ɾ�� [start,end)  ɾ���Ӵ�
		sf1.delete(5, 8);// ��hello"
		System.out.println(sf1);
		//���� ��һ�γ��ֵ�λ������
		int index1 = sf1.indexOf("ll");//2
		System.out.println(index1);
		sf1.append("ll");//"helloll"
		int index2 = sf1.lastIndexOf("ll");
//		String sf2 = new String("helloll");
		//���һ��
//		int index2 = sf2.lastIndexOf("ll");//5
		System.out.println(index2);
		System.out.println(sf1.charAt(4));//'o'
		//��ת
		sf1.reverse();
		System.out.println(sf1);
		//
		String str = "1236";
		StringBuffer sf3 = new StringBuffer(str);
		sf3.reverse();
		System.out.println(sf3);
		
		
		
		
		
		
		
		
	}

}
