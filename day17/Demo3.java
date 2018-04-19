package day17;

import java.io.File;
import java.util.Arrays;

class ShowAllFile{
	public void show(File f) {
		if (f.exists()) {
			if(f.isDirectory()) {
				File [] fs = f.listFiles();
				if(fs == null)
					return;
				for (File file : fs) {
					if(file.isDirectory()) {
						System.out.println("Ä¿Â¼£º"+file.getName());
						show(file);
					}else {
						System.out.println(file.getName());
					}
				}
			}else {
				System.out.println(f.getName());
			}
		}else {
			return;
		}
	}
}

public class Demo3 {

	public static void main(String[] args) {
		ShowAllFile s = new ShowAllFile();
		File f = new File("src/day02");
		s.show(f);
		
	}

}
