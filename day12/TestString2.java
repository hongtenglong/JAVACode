package day12;

import java.util.Scanner;

/**��ϰ��String��*/
//�û���
class User{
	private String userName;//��
	private String userPwd;//����
	//��ֵ
	public User(String userName, String userPwd) {
		this.userName = userName;
		this.userPwd = userPwd;
	}
	//���ֵ
	public String getUserName() {
		return userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
}
public class TestString2 {
	public void check() {
		//�û�
		User zhang = new User("zhang", "000000");
		//ԭʼ�û���������
		String userName = zhang.getUserName();
		String userPwd = zhang.getUserPwd();
		//�������������
		String name,pwd;
		Scanner input = new Scanner(System.in);
		int i;
		//3��
		for(i = 2; i >=0; i--) {
			//����
			System.out.println("--��������");
			name = input.next();
			System.out.println("--�������룺");
			pwd = input.next();
			//��֤
			if(userName.equals(name) && userPwd.equals(pwd)) {
				System.out.println("��¼�ɹ�");
				break;
			}else {
				System.out.println("��¼ʧ�ܣ�����"+i+"�λ���");
			}
		}
		//�ж�3�λ��ᶼû���˵����
		if(i < 0) {
			System.out.println("���λ����Ѿ��þ�");
		}
	}
	public static void main(String[] args) {
		new TestString2().check();
	}

}
