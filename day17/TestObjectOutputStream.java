package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**�����������л��ͷ����л�*/
class Student1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int no;
	private String name;
	private int age;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return no+","+name;
	}
		
}
public class TestObjectOutputStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// -------���л� �� ���� �洢�� �ļ���---------------------------------------
	/*	Student zhangsan = new Student();
		zhangsan.setName("����");
		zhangsan.setNo(11);
		//1
		FileOutputStream fout = new FileOutputStream("d:/data/obj.txt");
		ObjectOutputStream objOut = new ObjectOutputStream(fout);
		//2
		objOut.writeObject(zhangsan);
		//3.
		objOut.close();*/
		//----------------�����л�--------------------------------------------
		//1.
		FileInputStream fin = new FileInputStream("d:/data/obj.txt");
		ObjectInputStream objIn = new ObjectInputStream(fin);
		//2.
		Student1 stu = (Student1)objIn.readObject();
		System.out.println(stu.getName()+","+stu.getNo());
		//3.
		objIn.close();
	}

}
