package day14;

class Tel<T,E>{
	private T no;
	private E telphone;
	
	public Tel(T no, E telphone) {
		super();
		this.no = no;
		this.telphone = telphone;
	}

	public T getNo() {
		return no;
	}

	public void setNo(T no) {
		this.no = no;
	}

	public E getTelphone() {
		return telphone;
	}

	public void setTelphone(E telphone) {
		this.telphone = telphone;
	}
	
}

class Apple1<T>{
	
	private T size;

	public T getSize() {
		return size;
	}

	public void setSize(T size) {
		this.size = size;
	}
	
}
class PersonNew{
	
	/*public void show(Apple<? extends Number> apple){
		
	}
	
	public void show(Apple<? extends Object> apple){
		
	}*/
	
	
	
}


public class homework1 {

}
