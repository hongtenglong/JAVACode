package day12;
/**��ϰ��String*/
public class TestString {
	//ȡ��
	public String leftStr(String s,int len) {
		//[0,len)  9 ��len-1
		return s.substring(0, len);
	}
	//ȡ�Ҵ�
	public String rightStr(String s,int len) {
		return s.substring(s.length()-len);
	}
	public static void main(String[] args) {
		// ��
		TestString t = new TestString();
		System.out.println(t.leftStr("abcdefg", 2));
		//�Ҵ�
		System.out.println(t.rightStr("abcdefg", 2));
	}

}
