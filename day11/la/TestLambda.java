package day11.la;

@FunctionalInterface
interface La{
	//�޲��޷���ֵ
	/*void show();*/
	//������
	/*void show(String name);*/
	//�з���ֵ�޲���
	/*String format();*/
	//�з���ֵ�Ͳ���
	Integer format(String str);
}

/*class LaImpl implements La{

	@Override
	public void show() {
		System.out.println("aa");
	}
	
}*/

public class TestLambda {

	public static void main(String[] args) {
		
	/*	La la1 =  new LaImpl();
		la1.show();*/
		
		//�����ڲ���
		/*La la2 = new La() {
			@Override
			public void show() {
				System.out.println("aa");
			}
		};
		la2.show();*/
		
		//lambda
		//(����)->{���ʽ};
		/*La la3 = ()->{System.out.println("aa");};
		la3.show();*/
		//��������д�ββ���Ҫ����(��ʵ�ֵĺ���ʽ�ӿ�ȷ��)
		/*La la4 = (name)->System.out.println(name);
		la4.show("zs");*/
		/*La la5 = ()->{return "aa";};
		System.out.println(la5.format());*/
		/*La la6 = (str)->{return Integer.parseInt(str);};
		System.out.println(la6.format("23"));*/
	}
}
