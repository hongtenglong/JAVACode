package day10;
import java.sql.*;

/*//2.0
interface MyCalindarNew extends MyCalindar{
	String getTime();//显示时间
}
//2.0
class MyClassNew implements MyCalindarNew{

	@Override
	public String getDate() {
		Date date = new Date(System.currentTimeMillis());
		return date.toString();
	}
	@Override
	public String getTime() {
		Time time = new Time(System.currentTimeMillis());
		return time.toString();
	}
	
}*/
//1.0
interface MyCalindar{
	String getDate();//显示日期
	//3.0
	default String getTime() {
		return new Time(System.currentTimeMillis()).toString();
	}
}
class MyClass implements MyCalindar{
	@Override
	public String getDate() {
		Date date = new Date(System.currentTimeMillis());
		return date.toString();
	}
	 
}
public class TestCalindar {

	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		String sdate = myClass.getDate();
		System.out.println(sdate);
		String stime = myClass.getTime();
		System.out.println(stime);
/*			MyClassNew  myClassNew = new MyClassNew();
		String sdate1 = myClassNew.getDate();
		System.out.println(sdate1);
		String stime = myClassNew.getTime();
		System.out.println(stime);*/
	}

}
