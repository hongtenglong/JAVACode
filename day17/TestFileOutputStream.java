package day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**ʾ����FileOutputStreamд��*/
public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		//д �� String  s = "hello" �浽  b.txt�ļ���
		//1.����������
		//        true ׷��  ,false ���� Ĭ�� false
		FileOutputStream fout = new FileOutputStream("d:/data/b.txt",false);
		//2.
//		String s = "hello";
//		byte [] b = s.getBytes();
//		fout.write(b);
		//(���飬������д��д�����ֽ�)
//		fout.write(b, 2, 2);
		fout.write(97);
		//3.
		fout.close();

	}

}
