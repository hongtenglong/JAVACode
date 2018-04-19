package day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**练习：字节流*/
public class TestFileOutputStream3 {

	public static void main(String[] args) throws IOException {
		// 把控制台输入的内容存到文件中
		//1
		Scanner input = new Scanner(System.in);
		FileOutputStream fout = new FileOutputStream("d:/data/name.txt");
        //2
		String name;
		while(true) {
			System.out.println("输入学员名：");
			name = input.next();
			if(name.equals("q")) {
				break;
			}
			fout.write(name.getBytes());//写名字
			fout.write("\r\n".getBytes());//写换行
		}
		//3
		input.close();
		fout.close();
	}

}
