package day17;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

/**ʾ����FileĿ¼*/
public class TestFile2 {

	public static void main(String[] args) {
		// Ŀ¼ 
/*		File d = new File("d:/data2/data3");
		System.out.println(d.exists());
		//�Ƿ� �� Ŀ¼
		System.out.println(d.isDirectory());
		//����Ŀ¼ �����ᴴ�� �����ڵĸ�Ŀ¼
		d.mkdir();
		//����Ŀ¼���� ���� �����ڵĸ�Ŀ¼
		d.mkdirs();*/
		File d = new File("d:/data");
		//list: ��� ��Ŀ¼�µ� ���е��ļ� �� �ļ��е�����
//		String [] str = d.list();
/*		String [] str = d.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				return name.endsWith("jpg");
			}
		});*/
		//�����ļ���  
	/*	String [] str = d.list((dir,name)->name.endsWith("java"));
		for(String s:str) {
			System.out.println(s);
		}*/
		//------------------------------------------------------
		//��� ĳ�� Ŀ¼�µ� ���� ��Ŀ¼���ļ��� File��ʽ
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
