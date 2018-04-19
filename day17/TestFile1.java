package day17;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
/**ʾ�����ļ�File*/
public class TestFile1 {

	public static void main(String[] args) throws IOException {
		//���ļ�
//		File f = new File("d:/data/a.txt");//1
//		File f = new File("a.txt");
//		File f = new File("d:/data","a.txt");//2
		File f1 = new File("d:/data");
		File f = new File(f1,"a.txt");//3
		//�ж� �ļ� �� �ļ��У�Ŀ¼���Ƿ���ڣ����� true,
		System.out.println(f.exists());//true
		//����һ���ļ�
		f.createNewFile();
		//�ж��Ƿ� ���ļ�
		System.out.println(f.isFile());//true
		//�ļ�������
		System.out.println(f.getName());//a.txt
		//·�� 
		System.out.println(f.getPath());
		//����·��  d:\data\a.txt
		System.out.println(f.getAbsolutePath());
		//��·��
		System.out.println(f.getParent());//d:\data
		//�ɶ�
		System.out.println(f.canRead());
		//��д
		System.out.println(f.canWrite());
		
		//���һ���޸ĵ�ʱ��
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(f.lastModified()));
		
		//��� �ļ� �� ���ݵ��ֽڴ�С long
		System.out.println(f.length());//0
		f.delete();
		System.out.println(f.exists());//false
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
