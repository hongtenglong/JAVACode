package day17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**ʾ����������*/
public class TestDataInputStream {

	public static void main(String[] args) throws IOException {
		//������
		//�� ������ڴ� �� ���ļ���
		int [] no = {11,22,33};
		String [] name = {"����","zhangsan","����"};
		//�����
		//1
//		DataOutputStream dout = new DataOutputStream(new FileOutputStream("d:/data/x.txt"));
		File f = new File("d:/data/x.txt");
		FileOutputStream fout = new FileOutputStream(f);
		DataOutputStream dout = new DataOutputStream(fout);
		//2д
		for(int i = 0; i < no.length; i++) {
			dout.writeInt(no[i]);
			dout.writeUTF(name[i]);
		}
		//3.
		dout.close();
		//--------------------------------------------------------------
		//������
		//1.
		File f1 = new File("d:/data/x.txt");
		FileInputStream fin = new FileInputStream(f1);
		DataInputStream din = new DataInputStream(fin);
		//2.
		for(int i = 0; i < no.length; i++) {
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
		}
		//3.
		din.close();
		

	}

}
