package day17;

import java.io.File;

/**练习：File*/
public class TestFile3 {

	public void showFiles(File f) {
		if(f.exists()) {//是否存在
			if(f.isDirectory()) {//是否是目录
				File [] fs = f.listFiles();
				if(fs == null) {
					return;
				}
				for(File ff : fs) {
					if(ff.isDirectory()) {
						System.out.println("目录："+ff.getName());
						showFiles(ff);//递归调用,展示子目录
					}else {
						System.out.println(ff.getName());
					}
				}
			}else {
				return;
			}
		}else {
			return;
		}
	}
	public static void main(String[] args) {
		// 所有子目录下内容展示
		File f = new File("d:/data");
		new TestFile3().showFiles(f);

	}

}
