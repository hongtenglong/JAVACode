package day17;

import java.io.File;

/**��ϰ��File*/
public class TestFile3 {

	public void showFiles(File f) {
		if(f.exists()) {//�Ƿ����
			if(f.isDirectory()) {//�Ƿ���Ŀ¼
				File [] fs = f.listFiles();
				if(fs == null) {
					return;
				}
				for(File ff : fs) {
					if(ff.isDirectory()) {
						System.out.println("Ŀ¼��"+ff.getName());
						showFiles(ff);//�ݹ����,չʾ��Ŀ¼
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
		// ������Ŀ¼������չʾ
		File f = new File("d:/data");
		new TestFile3().showFiles(f);

	}

}
