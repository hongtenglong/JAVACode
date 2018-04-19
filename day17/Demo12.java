package day17;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Student implements Serializable{
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
		return no + name;
	}
	
}
public class Demo12 {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Student zhangsan = new Student();
		zhangsan.setName("ÕÅÈý");
		zhangsan.setNo(11);
		ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("src/day17/data/obj.txt"));
		objOut.writeObject(zhangsan);
		objOut.close();
		
		//
		ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("src/day17/data/obj.txt"));
		Student stu = (Student)objIn.readObject();
		System.out.println(stu.getName()+","+stu.getNo());
	}

}
