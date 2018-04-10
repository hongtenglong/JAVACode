package day10;
/**示例：接口多态*/
interface WebBank{
	public abstract void webService();//抽象
}
class Jingdong implements WebBank{
	@Override
	public void webService() {
		System.out.println("京东实现了网上支付");
	}
	public void func() {}
}
class Taobao implements WebBank{
	@Override
	public void webService() {
		System.out.println("淘宝实现了网上支付");
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
