package day17;
import java.io.*;

/*
 * ���ã�
�ҵ�������{name}������һֻ{type}.
�ҵ�������{master}��
 * */
public class Demo16 {
	public static void main(String[] args) throws IOException {
		File file = new File("src/day17/data/temp.txt");
		FileReader fr = new FileReader(file);
		char [] b = new char[(int) file.length()];
		fr.read(b);
		String s = new String(b);
		StringBuilder sb = new StringBuilder(s);
		sb.replace(sb.indexOf("{name}"), sb.indexOf("{name}")+"{name}".length(), "С��");
		sb.replace(sb.indexOf("{type}"), sb.indexOf("{type}")+"{type}".length(), "��ʿ��");
		sb.replace(sb.indexOf("{master}"), sb.indexOf("{master}")+"{master}".length(), "������");
		System.out.println(sb);
		FileWriter fw = new FileWriter(file);
		fw.write(sb.toString());
		fw.flush();
		fw.close();
		fr.close();
		
	}

}
