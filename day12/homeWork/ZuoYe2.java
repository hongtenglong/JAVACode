package day12.homeWork;

import java.util.ArrayList;
import java.util.Arrays;

import javafx.scene.layout.Background;

public class ZuoYe2 {
	public static void main(String[] args) {
		//��ҵ1
		//ģ��һ��trim������ȥ���ַ������˵Ŀո�
		String s1 = "    hello worl   d   ";
		System.out.println(s1.trim());
		
		
		//��ҵ2
		//��һ���ַ������з�ת�����ַ�����ָ�����ֽ��з�ת�����罫��abcdefg����תΪ��abfedcg��
		int left = 2,right = 6;
		String s2 = "abcdefg";
		StringBuilder sb = new StringBuilder(s2);		
		StringBuilder ss2 = new StringBuilder(sb.substring(left, right));
		System.out.println(sb.replace(left, right, ss2.reverse().toString()));
		
		//��ҵ3
		//��ȡһ���ַ�������һ���ַ����г��ֵĴ�����
        //���磺��ȡ��ab���� ��abkkcadkabkebfkabkskab��
		// �г��ֵĴ���
		StringBuilder sb3 = new StringBuilder("abkkcadkabkebfkabkskab");
		int count = 0;
		int index = sb3.lastIndexOf("ab");
		while(index!=-1) {
			count++;
			sb3.delete(index, index+2);
			index = sb3.lastIndexOf("ab");
		}
		System.out.println(count);
		
		
		//��ҵ4
		//���ַ������ַ�������Ȼ˳������
		String str4 = "ahjdashfjkancxxl";
		char [] c = str4.toCharArray();
		Arrays.sort(c);
		System.out.println(c);

	}
}
