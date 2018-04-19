package day17;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo11 {

	public static void main(String[] args) throws IOException {
		int [] no = {11,22,33};
		String [] name = {"张三","李四","王五"};
		DataOutputStream dout = new DataOutputStream
				(new FileOutputStream("src/day17/data/x.txt"));
		for (int i=0;i<no.length;i++) {
			dout.writeInt(no[i]);
			dout.writeUTF(name[i]);
		}
		dout.flush();
		dout.close();
		
		DataInputStream din = new DataInputStream(new FileInputStream("src/day17/data/x.txt"));
		for (int i=0;i<no.length;i++) {
			System.out.println(din.readInt());;
			System.out.println(din.readUTF());;
		}
		din.close();
	}

}
