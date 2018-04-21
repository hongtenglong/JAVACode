package day18.lianxi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
class Goods8 implements Serializable{
	private int no;
	private String name;
	private double price;
	
	@Override
	public String toString() {
		return no + "\t" + name + "\t" + price ;
	}
	public Goods8() {
		no = 0;
		name = "";
		price = 0.0;
		// TODO Auto-generated constructor stub
	}
	public Goods8(int no, String name, double price) {
		super();
		this.no = no;
		this.name = name;
		this.price = price;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	
}
public class LianXi8 {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Set<Goods8> set = new HashSet<>();
		set.add(new Goods8(1,"¿±Ãı",1.5));
		set.add(new Goods8(2,"—©∏‚",3.5));
		set.add(new Goods8(3,"ø…¿÷",2.5));
		FileOutputStream fos = new FileOutputStream("src/day18/lianxi/GoodsSet.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(set);
		oos.flush();
		oos.close();
		
		
		FileInputStream fis = new FileInputStream("src/day18/lianxi/GoodsSet.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Set<Goods8> set2 = (Set<Goods8>) ois.readObject();
		set2.forEach(System.out::println);
	}

}
