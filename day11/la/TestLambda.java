package day11.la;

@FunctionalInterface
interface La{
	//无参无返回值
	/*void show();*/
	//带参数
	/*void show(String name);*/
	//有返回值无参数
	/*String format();*/
	//有返回值和参数
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
		
		//匿名内部类
		/*La la2 = new La() {
			@Override
			public void show() {
				System.out.println("aa");
			}
		};
		la2.show();*/
		
		//lambda
		//(参数)->{表达式};
		/*La la3 = ()->{System.out.println("aa");};
		la3.show();*/
		//带参数，写形参不需要类型(由实现的函数式接口确定)
		/*La la4 = (name)->System.out.println(name);
		la4.show("zs");*/
		/*La la5 = ()->{return "aa";};
		System.out.println(la5.format());*/
		/*La la6 = (str)->{return Integer.parseInt(str);};
		System.out.println(la6.format("23"));*/
	}
}
