package day14;

import java.util.List;
import java.util.Map;

class Test11{
	private String x;

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}
	
}

class Test12{
	
	private Double y;

	public Double getY() {
		return y;
	}

	public void setY(Double y) {
		this.y = y;
	}

}


//review
class Test13{
	
	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
}

class Base{
	
}

interface IA{
	
}




class IAimpl extends Base implements IA{
	
}
//泛型(参数化类型)
   //可以设置上界
   //可以设置多个上界
//T:type    E:element  K:key   v:value
class Test4<T extends Base & IA>{
	
	private T t;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}


public class Test {

	//输出值
	//Test4<String>不是Test4<Object>的之类
	
	
	//设置参数类型
	
	//无界  通配符    ?
	
	//数字 设置上界   extends(类型只能是该类及其该类的子类   Integer Float Double)
	/*public void show(Test4<? extends Number> test){
		System.out.println(test.getT());
	}
	
	//设置下界   super(类型只能是该类及其该类父类)
	public void show2(Test4<? super Number> test){
		System.out.println(test.getT());
	}*/
	
	
	public static void main(String[] args) {
		
		Test4<IAimpl> t5 = new Test4<IAimpl>();
		/*t5.setT(new Double(12.0));
		test.show(t5);*/
		
		
		//原生类型
		//Test4 test4 = new Test4();
		Test test = new Test();
		//String类型参数
		/*Test4<String> t4 = new Test4<String>();
		t4.setT("aa");
		test.show2(t4);
		
		Test4<Double> t5 = new Test4<Double>();
		t5.setT(new Double(12.0));
		test.show2(t5);
		
		Test4<Object> t6 = new Test4<Object>();
		t6.setT("aaa");
		test.show2(t6);*/
		
		/*Test4<Double> t5 = new Test4<Double>();
		t5.setT(new Double(12.0));
		test.show(t5);
		
		Test4<Object> t6 = new Test4<Object>();
		t6.setT("aaa");
		test.show2(t6);*/
		
		//菱形写法   类型推断
		//Test4<Double> t6 = new Test4<>();
		
		/*Test1 t1 = new Test1();
		t1.setX("aa");
		System.out.pri{
		ntln(t1.getX());
		
		Test2 t2 = new Test2();
		//Double是double的包装类型
		t2.setY(12.0);
		System.out.println(t2.getY());*/
		
		/*Test3 t3 = new Test3();
		t3.setObj("aa");
		String str = (String) t3.getObj();
		System.out.println(str);
		
		t3.setObj(new Double(12.0));
		Double d = (Double) t3.getObj();
		System.out.println(d);*/
	}

}
