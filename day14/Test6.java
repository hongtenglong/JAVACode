package day14;

import java.util.Map;

//���ö������������
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

//���͹�����  ���ͽӿ�  ���ͷ���
class PersonN{
	//���췽��
	public <T> PersonN(T t) {
		System.out.println(t);
	}
	
	//����ʹ�÷���
	public <T> T show(T t){
		return t;
	}
	
}

//���ͽӿ�ʹ��
interface IA1<T>{
	void show(T t);
}

//ʵ�����Ծɲ�ȷ������
class IAImpl2<T> implements IA1<T>{
	@Override
	public void show(T t) {
		
	}
}
//ʵ����ȷ������
class IAImpl3 implements IA1<String>{
	@Override
	public void show(String t) {
		
	}
}



public class Test6 {

	public static void main(String[] args) {
		//�����ƶ�
		//Person<Integer,String> p = new Person<>();
		//���͹�����ʹ��
		PersonN p = new <String>PersonN("aa");
		PersonN p1 = new <Integer>PersonN(1);
		//�����ƶ�
		PersonN p2 = new PersonN(1);
		
	}
}
