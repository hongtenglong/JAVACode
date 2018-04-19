package day17;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**练习：文件字节流:图片复制 缓冲流*/
public class TestFileOutputStream2 {

	public static void main(String[] args) throws IOException {
		//1创建流对象
		//读流
		File f1 = new File("d:/data/aoteman.jpg");
		FileInputStream fin = new FileInputStream(f1);
		// 8192板车，读缓冲区
		BufferedInputStream bfin = new BufferedInputStream(fin);
		//写流 
		File f2 = new File("d:/data/aotemannew.jpg");
        FileOutputStream fout = new FileOutputStream(f2);
        // 8192 汽车，写缓冲区
        BufferedOutputStream bfout = new BufferedOutputStream(fout);
        //2读写
        int temp;
        while((temp = bfin.read())!= -1){
        	bfout.write(temp);
        }
        bfout.flush();//强制刷新
        //3.关
        fin.close();
        bfin.close();
        fout.close();
        bfout.close();
        
        
        
        
	
	
	}

}
