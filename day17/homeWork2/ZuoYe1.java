package day17.homeWork2;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ZuoYe1 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		FileReader fr = null;
		BufferedReader br;
		try {
			fr = new FileReader("src/day17/homeWork2/Hello.java");
			br = new BufferedReader(fr);
			String str;
			while((str = br.readLine())!=null) {
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}

}
