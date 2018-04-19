package day17;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
/**示例：文件File*/
public class TestFile1 {

	public static void main(String[] args) throws IOException {
		//对文件
//		File f = new File("d:/data/a.txt");//1
//		File f = new File("a.txt");
//		File f = new File("d:/data","a.txt");//2
		File f1 = new File("d:/data");
		File f = new File(f1,"a.txt");//3
		//判断 文件 或 文件夹（目录）是否存在，存在 true,
		System.out.println(f.exists());//true
		//创建一个文件
		f.createNewFile();
		//判断是否 是文件
		System.out.println(f.isFile());//true
		//文件的名字
		System.out.println(f.getName());//a.txt
		//路径 
		System.out.println(f.getPath());
		//绝对路径  d:\data\a.txt
		System.out.println(f.getAbsolutePath());
		//父路径
		System.out.println(f.getParent());//d:\data
		//可读
		System.out.println(f.canRead());
		//可写
		System.out.println(f.canWrite());
		
		//最后一次修改的时间
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(f.lastModified()));
		
		//获得 文件 的 内容的字节大小 long
		System.out.println(f.length());//0
		f.delete();
		System.out.println(f.exists());//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
