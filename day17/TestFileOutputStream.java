package day17;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**示例：FileOutputStream写入*/
public class TestFileOutputStream {

	public static void main(String[] args) throws IOException {
		//写 ： String  s = "hello" 存到  b.txt文件中
		//1.创建流对象
		//        true 追加  ,false 覆盖 默认 false
		FileOutputStream fout = new FileOutputStream("d:/data/b.txt",false);
		//2.
//		String s = "hello";
//		byte [] b = s.getBytes();
//		fout.write(b);
		//(数组，从哪里写，写几个字节)
//		fout.write(b, 2, 2);
		fout.write(97);
		//3.
		fout.close();

	}

}
