package day17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**ʾ����FileInputStream*/
public class TestFileInputStream {

	public static void main(String[] args) throws IOException {
		// ��d:/data/a.txt�ļ��е����� ���浽 �ڴ���
//		File f = new File("d:/data/a.txt");
//		FileInputStream fin = new FileInputStream(f);
		//1.����������
		FileInputStream fin = new FileInputStream("d:/data/a.txt");
		//ת�� �ַ���  ���� �ֽ��� ת�� ���ַ���(��װ��)
		InputStreamReader ir = new InputStreamReader(fin);
		//2.��ȡ�ļ�������
	/*	int temp = fin.read();
		System.out.println((char)temp);//
		System.out.println((char)fin.read());
		System.out.println((char)fin.read());
		System.out.println(fin.read());//�����ļ� ĩβ �� -1
*/		
		//�ֽ��� ��ȡ
/*		int temp;
		while((temp = fin.read()) != -1) {
			System.out.print((char)temp);
		}*/
		int temp;
		while((temp = ir.read()) != -1) {
			System.out.print((char)temp);
		}
		//3.�ر���
//		fin.close();
//		ir.close();
		ir.close();
		
	}

}
