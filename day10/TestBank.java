package day10;
/**ʾ�����ӿڶ�̬*/
interface WebBank{
	public abstract void webService();//����
}
class Jingdong implements WebBank{
	@Override
	public void webService() {
		System.out.println("����ʵ��������֧��");
	}
	public void func() {}
}
class Taobao implements WebBank{
	@Override
	public void webService() {
		System.out.println("�Ա�ʵ��������֧��");
	}
}
public class TestBank {

	public static void main(String[] args) {
		WebBank jingdong = new Jingdong();
		jingdong.webService();
//		jingdong.func();
		WebBank tao = new Taobao();
		tao.webService();
	}

}
