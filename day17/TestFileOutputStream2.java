package day17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**��ϰ���ļ��ֽ���:ͼƬ���� ������*/
public class TestFileOutputStream2 {

	public static void main(String[] args) throws IOException {
		//1����������
		//����
		File f1 = new File("d:/data/aoteman.jpg");
		FileInputStream fin = new FileInputStream(f1);
		// 8192�峵����������
		BufferedInputStream bfin = new BufferedInputStream(fin);
		//д�� 
		File f2 = new File("d:/data/aotemannew.jpg");
        FileOutputStream fout = new FileOutputStream(f2);
        // 8192 ������д������
        BufferedOutputStream bfout = new BufferedOutputStream(fout);
        //2��д
        int temp;
        while((temp = bfin.read())!= -1){
        	bfout.write(temp);
        }
        bfout.flush();//ǿ��ˢ��
        //3.��
        fin.close();
        bfin.close();
        fout.close();
        bfout.close();
        
        
        
        
	
	
	}

}
