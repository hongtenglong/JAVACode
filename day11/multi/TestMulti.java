package day11.multi;

//�������й��Ե����ݣ��������������ϳ�ȡ(����)
//���������в�ͬ��������ʽ,�޷���������,����Ϊ����
abstract class Animal{
	String name;
	abstract void eat();
	
}


class Pig extends Animal{
	
	String name="С������";
	@Override
	void eat() {
		System.out.println("����ʳ");
	}
	
}

class Dog extends Animal{
	String name = "����";
	@Override
	void eat() {
		System.out.println("�Թ���");
	}
	
	public void door(){
		System.out.println("����");
	}
	
}

//����
class Master{
	String name = "atm";
	
	//�����(���ݴ����ַ�������ͬ����)
	public Animal buy(String str){
		if("dog".equalsIgnoreCase(str)){
			return new Dog();
		}else{
			return new Pig();
		}
	}
	
	//��ˣ
	/*public void play(Pig pig){
		System.out.println(name+"���ں�"+pig.name+"��ˣ");
	}
	public void play(Dog dog){
		System.out.println(name+"���ں�"+dog.name+"��ˣ");
	}*/
	public void play(Animal anim){
		System.out.println(name+"���ں�"+anim.name+"��ˣ");
	}
	
}


public class TestMulti {

	public static void main(String[] args) {
		Master master = new Master();
		System.out.println(master.buy("dog") instanceof Dog);
		/*Master master = new Master();
		Animal anim = new Dog();
		anim.name = "����";
		master.play(anim);*/
		
		
		/*Dog dog = new Dog();
		master.play(dog);*/
		//��̬(���õ���������ķ���)
		//Animal anim = new Dog();
		//anim.eat();
		//�޷�����������з���
		//anim.door();
		//ǿ������ת��(���Ϊת��Ϊ��ʵ����)
		/*if(anim instanceof Dog){
			
		}else if(anim instanceof Pig){
			
		}*/
	}
	
	//������Ϊ��������
	
	//����������Ϊ����ֵ����
	
	
}
