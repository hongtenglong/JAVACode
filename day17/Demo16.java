package day17;
import java.io.*;

/*
 * 您好！
我的名字是{name}，我是一只{type}.
我的主人是{master}。
 * */
public class Demo16 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/day17/data/temp.txt");
		FileReader fr = new FileReader(file);
		char [] b = new char[(int) file.length()];
		fr.read(b);
		String s = new String(b);
		StringBuilder sb = new StringBuilder(s);
		sb.replace(sb.indexOf("{name}"), sb.indexOf("{name}")+"{name}".length(), "小花");
		sb.replace(sb.indexOf("{type}"), sb.indexOf("{type}")+"{type}".length(), "哈士奇");
		sb.replace(sb.indexOf("{master}"), sb.indexOf("{master}")+"{master}".length(), "洪腾龙");
		System.out.println(sb);
		FileWriter fw = new FileWriter(file);
		fw.write(sb.toString());
		fw.flush();
		fw.close();
		fr.close();
		
	}

}
