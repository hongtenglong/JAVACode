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
//����(����������)
   //���������Ͻ�
   //�������ö���Ͻ�
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

	//���ֵ
	//Test4<String>����Test4<Object>��֮��
	
	
	//���ò�������
	
	//�޽�  ͨ���    ?
	
	//���� �����Ͻ�   extends(����ֻ���Ǹ��༰����������   Integer Float Double)
	/*public void show(Test4<? extends Number> test){
		System.out.println(test.getT());
	}
	
	//�����½�   super(����ֻ���Ǹ��༰����ุ��)
	public void show2(Test4<? super Number> test){
		System.out.println(test.getT());
	}*/
	
	
	public static void main(String[] args) {
		
		Test4<IAimpl> t5 = new Test4<IAimpl>();
		/*t5.setT(new Double(12.0));
		test.show(t5);*/
		
		
		//ԭ������
		//Test4 test4 = new Test4();
		Test test = new Test();
		//String���Ͳ���
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
		
		//����д��   �����ƶ�
		//Test4<Double> t6 = new Test4<>();
		
		/*Test1 t1 = new Test1();
		t1.setX("aa");
		System.out.pri{
		ntln(t1.getX());
		
		Test2 t2 = new Test2();
		//Double��double�İ�װ����
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
