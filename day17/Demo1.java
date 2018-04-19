package day17;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.DecimalFormat;

import javafx.scene.input.DataFormat;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//���ļ����ļ���
		//File f = new File("E:/eclipseWorkSpace/aura02/src/day17/data/a.txt");
		//File f = new File("/day17/data/a.txt");
		//File f = new File("E:/eclipseWorkSpace/aura02/src/day17/data","a.txt");
		File f1 = new File("E:/eclipseWorkSpace/aura02/src/day17/data");
		File f = new File(f1,"a.txt");
		//�ж��ļ����ļ����Ƿ����
		System.out.println(f.exists());
		//����һ���ļ�
		f.createNewFile();
		//�ж��Ƿ�Ϊ�ļ�
		System.out.println(f.isFile());
		//��ȡ�ļ�������
		System.out.println(f.getName());
		
		//·��
		System.out.println(f.getPath());
		//����·��
		System.out.println(f.getAbsolutePath());
		//��·��
		System.out.println(f.getParent());
		//�ɶ�
		System.out.println(f.canRead());
		//��д
		System.out.println(f.canWrite());
		//���һ���޸ĵ�ʱ��
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(f.lastModified()));
		
		//����ļ������ݵ��ֽڴ�С
		System.out.println(f.length());
		//ɾ���ļ�
		f.delete();
		System.out.println(f.exists());
		
	}
}










