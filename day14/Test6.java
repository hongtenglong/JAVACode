package day14;

import java.util.Map;

//设置多个参数化类型
class Person<T,E>{
	
	private T t;
	private E e;
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public E getE() {
		return e;
	}
	public void setE(E e) {
		this.e = e;
	}
	
}

//泛型构造器  泛型接口  泛型方法
class PersonN{
	//构造方法
	public <T> PersonN(T t) {
		System.out.println(t);
	}
	
	//方法使用泛型
	public <T> T show(T t){
		return t;
	}
	
}

//泛型接口使用
interface IA1<T>{
	void show(T t);
}

//实现类仍旧不确定类型
class IAImpl2<T> implements IA1<T>{
	@Override
	public void show(T t) {
		
	}
}
//实现类确定类型
class IAImpl3 implements IA1<String>{
	@Override
	public void show(String t) {
		
	}
}



public class Test6 {

	public static void main(String[] args) {
		//类型推断
		//Person<Integer,String> p = new Person<>();
		//泛型构造器使用
		PersonN p = new <String>PersonN("aa");
		PersonN p1 = new <Integer>PersonN(1);
		//类型推断
		PersonN p2 = new PersonN(1);
		
	}
}
