package day17;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File d = new File("src/day17");
		//System.out.println(d.exists());
		//System.out.println(d.isDirectory());
		//不会创建不存在的父目录
		d.mkdir();
		//会创建不存在的父目录
		d.mkdirs();
		
		//String [] str = d.list();
		/*String [] str = d.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				// TODO Auto-generated method stub
				return name.endsWith("java");
			}
		});*/
		/*String [] str = d.list((dir,name)->name.endsWith("java"));
		for (String string : str) {
			System.out.println(string);
		}*/
				
		//获得某目录下的所有的穆勒和文件的file形式
		//File [] fs = d.listFiles();
		File [] fs = d.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				// TODO Auto-generated method stub
				return pathname.getName().endsWith("java");
			}
		});
		
		for (File file : fs) {
			System.out.println(file.getName());
		}
	}

}
