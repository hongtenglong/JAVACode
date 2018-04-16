package day14;

class Apple<T extends Number>{
	private T size;

	public T getSize() {
		return size;
	}

	public void setSize(T size) {
		this.size = size;
	}
}

class Phone<N extends Number, T extends String>{
	private N no;
	private T phoneNumber;
	
	public N getNo() {
		return no;
	}
	public void setNo(N no) {
		this.no = no;
	}
	public T getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(T phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
}
public class Demo3 {
	public static void main(String[] args) {
		Phone<Integer,String> p = new Phone();
		p.setNo(0001);
		p.setPhoneNumber("aaaaa");
	}
}
