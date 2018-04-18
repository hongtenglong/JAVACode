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
			System.out.println("该商品已存在，输入数量会代替原来的数量");
			map.put(goods, num);
		}else {
			map.put(goods, num);
			System.out.println("加入成功！");
		}
		
	}
	
	public void update(Goods goods,int num) {
		if(!map.containsKey(goods)) {
			System.out.println("该商品不存在，请重新选择");
		}else {
			map.put(goods,num);
			System.out.println("修改成功");
		}
		
	}
	public void delete(Goods goods) {
		if(!map.containsKey(goods)) {
			System.out.println("该商品不存在，请重新选择");
		}else {
			map.remove(goods);
		}
	}
	public void showCar() {
		map.forEach((k,v)->System.out.println(k+"\t"+v));
	}
}
