package day17;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;

import javafx.scene.input.DataFormat;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//对文件或文件夹
		//File f = new File("E:/eclipseWorkSpace/aura02/src/day17/data/a.txt");
		//File f = new File("/day17/data/a.txt");
		//File f = new File("E:/eclipseWorkSpace/aura02/src/day17/data","a.txt");
		File f1 = new File("E:/eclipseWorkSpace/aura02/src/day17/data");
		File f = new File(f1,"a.txt");
		//判断文件或文件夹是否存在
		System.out.println(f.exists());
		//创建一个文件
		f.createNewFile();
		//判断是否为文件
		System.out.println(f.isFile());
		//获取文件的名字
		System.out.println(f.getName());
		
		//路径
		System.out.println(f.getPath());
		//绝对路径
		System.out.println(f.getAbsolutePath());
		//父路径
		System.out.println(f.getParent());
		//可读
		System.out.println(f.canRead());
		//可写
		System.out.println(f.canWrite());
		//最后一次修改的时间
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(f.lastModified()));
		
		//获得文件的内容的字节大小
		System.out.println(f.length());
		//删掉文件
		f.delete();
		System.out.println(f.exists());
		
	}
}










