package day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**��ϰ���ֽ���*/
public class TestFileOutputStream3 {

	public static void main(String[] args) throws IOException {
		// �ѿ���̨��������ݴ浽�ļ���
		//1
		Scanner input = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("d:/data/name.txt");
        //2
		String name;
		while(true) {
			System.out.println("����ѧԱ����");
			name = input.next();
			if(name.equals("q")) {
				break;
			}
			fout.write(name.getBytes());//д����
			fout.write("\r\n".getBytes());//д����
		}
		//3
		input.close();
		fout.close();
	}

}
