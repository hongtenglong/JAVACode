package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
/**ʾ����FileInputStream��ȡ�ļ� read()*/
public class TestFileInputStream2 {

	public static void main(String[] args) throws IOException {
		// FileInputStream
		//1
		File f = new File("d:/data/a.txt");
		FileInputStream fin = new FileInputStream(f);
//		FileInputStream fin = new FileInputStream("d:/data/a.txt");
		//2
//		byte [] b = new byte[fin.available()];//�ļ����ݵ��ֽڴ�С
		byte [] b = new byte[(int)f.length()];//�ļ����ݵ��ֽڴ�С
		//�� �������ļ������ݵ��ֽ� �浽 b��������У�����ֵ �������ļ������ֽڴ�С
//		fin.read(b);
		//���洢�����飬�����������λ�ã�������
		fin.read(b, 2, 3);
		String s = new String(b,"gbk");
		System.out.println(s);
		//3.
		fin.close();

	}

}
