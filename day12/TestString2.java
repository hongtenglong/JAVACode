package day12;

import java.util.Scanner;

/**练习：String类*/
//用户类
class User{
	private String userName;//名
	private String userPwd;//密码
	//赋值
	public User(String userName, String userPwd) {
		this.userName = userName;
		this.userPwd = userPwd;
	}
	//获得值
	public String getUserName() {
		return userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
}
public class TestString2 {
	public void check() {
		//用户
		User zhang = new User("zhang", "000000");
		//原始用户名和密码
		String userName = zhang.getUserName();
		String userPwd = zhang.getUserPwd();
		//输入的名和密码
		String name,pwd;
		Scanner input = new Scanner(System.in);
		int i;
		//3次
		for(i = 2; i >=0; i--) {
			//输入
			System.out.println("--输入名：");
			name = input.next();
			System.out.println("--输入密码：");
			pwd = input.next();
			//验证
			if(userName.equals(name) && userPwd.equals(pwd)) {
				System.out.println("登录成功");
				break;
			}else {
				System.out.println("登录失败，还有"+i+"次机会");
			}
		}
		//判断3次机会都没有了的情况
		if(i < 0) {
			System.out.println("三次机会已经用尽");
		}
	}
	public static void main(String[] args) {
		new TestString2().check();
	}

}
