package day17;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**示例：File目录*/
public class TestFile2 {

	public static void main(String[] args) {
		// 目录 
/*		File d = new File("d:/data2/data3");
		System.out.println(d.exists());
		//是否 是 目录
		System.out.println(d.isDirectory());
		//创建目录 ，不会创建 不存在的父目录
		d.mkdir();
		//创建目录，会 创建 不存在的父目录
		d.mkdirs();*/
		File d = new File("d:/data");
		//list: 获得 此目录下的 所有的文件 和 文件夹的名称
//		String [] str = d.list();
/*		String [] str = d.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("jpg");
			}
		});*/
		//过滤文件名  
	/*	String [] str = d.list((dir,name)->name.endsWith("java"));
		for(String s:str) {
			System.out.println(s);
		}*/
		//------------------------------------------------------
		//获得 某个 目录下的 所有 的目录和文件的 File形式
//		File [] fs = d.listFiles();
/*		File [] fs = d.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				return pathname.getName().endsWith("java");
			}
		});*/
		File [] fs = d.listFiles(p -> p.getName().endsWith("jpg"));
		for(File f:fs) {

			System.out.println(f.getName());

		}
/*		for(File f:fs) {
			if(f.isDirectory()) {
				System.out.println(f.getPath());
			}else if(f.isFile()) {
				System.out.println(f.getName());
			}
		}*/
		
		
		
	}

}
