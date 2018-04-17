package day15.homeWork;

import java.util.HashSet;
import java.util.Set;

class Mouse implements Comparable<Mouse>{
	private String name;
	private String hobby;
	private int age;
	public String getName() {
		return name;
	}
	public String getHobby() {
		return hobby;
	}
	public int getAge() {
		return age;
	}
	public Mouse(String name, String hobby, int age) {
		super();
		this.name = name;
		this.hobby = hobby;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Mouse [name=" + name + ", hobby=" + hobby + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Mouse o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mouse other = (Mouse) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}

public class ZuoYe2 {
	public static void main(String[] args) {
		Mouse taotao = new Mouse("ÌÔÌÔ", "×¥Ã¨", 21);
		Mouse jerry = new Mouse("½ÜÈğ", "¶ºÌÀÄ·", 23);
		Set<Mouse> set = new HashSet<>();
		set.add(taotao);
		set.add(jerry);
		Mouse jerry1 = new Mouse("½ÜÈğ", "Íµ³ÔÓÍ", 22);
		set.add(jerry1);
		set.iterator().forEachRemaining(System.out::println);
		set.remove(jerry);
		System.out.println("É¾³ıÀÏÊó½ÜÈğºó");
		set.forEach(System.out::println);
	}
}






