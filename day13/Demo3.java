package day13;

class GenderException extends Exception{
	private String s;
	public GenderException() {
	}
	public GenderException(String message) {
		this.s =message;
	}
	@Override
	public String getMessage(){
		return s;
	}
}

public class Demo3 {
	public static void main(String[] args) {
		String sex = "1";
		if(sex.equals("��")||sex.equals("Ů")){
		}else {
			try {
				throw new GenderException("�Ա�ֻ�����л�Ů");
			} catch (GenderException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
	}
}
