package day16.trolley;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Car {
	private Map<Goods, Integer> map = new LinkedHashMap<>();
	
	public Map<Goods, Integer> getMap() {
		return map;
	}

	public void setMap(Map<Goods, Integer> map) {
		this.map = map;
	}

	public void add(Goods goods,int num) {
		if(map.containsKey(goods)) {
			System.out.println("����Ʒ�Ѵ��ڣ��������������ԭ��������");
			map.put(goods, num);
		}else {
			map.put(goods, num);
			System.out.println("����ɹ���");
		}
		
	}
	
	public void update(Goods goods,int num) {
		if(!map.containsKey(goods)) {
			System.out.println("����Ʒ�����ڣ�������ѡ��");
		}else {
			map.put(goods,num);
			System.out.println("�޸ĳɹ�");
		}
		
	}
	public void delete(Goods goods) {
		if(!map.containsKey(goods)) {
			System.out.println("����Ʒ�����ڣ�������ѡ��");
		}else {
			map.remove(goods);
		}
	}
	public void showCar() {
		map.forEach((k,v)->System.out.println(k+"\t"+v));
	}
}
