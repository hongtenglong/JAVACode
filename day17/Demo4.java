package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo4 {
	public static void main(String[] args) throws IOException {
		//�� src/day17/demo1.java �ļ�������  �浽�ڴ���
		//File f = new File("src/day17/demo1.java");
		//FileInputStream fin = new FileInputStream(f);
		//����������
		FileInputStream fin = new FileInputStream("src/day17/demo1.java");
		InputStreamReader isr = new InputStreamReader(fin);
		//��ȡ�ļ�������
		/*int temp;
		while((temp=fin.read())!=-1) {
			System.out.print((char)temp);
		}*/
		//������������
		int temp;
		while((temp=isr.read())!=-1) {
			System.out.print((char)temp);
		}
		
	}
}
