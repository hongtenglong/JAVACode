package day16.mapoperator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CartOperator {
	private Map<Goods,Integer> cart = new HashMap<>();
	
	public void add(Goods goods,int count) {
		cart.put(goods,count);
	}
	
	public void queryAll() {
		if(cart.size() > 0) {
			System.out.println("商品编号\t商品名称\t商品单价\t商品数量");
			Iterator<Entry<Goods,Integer>> i = cart.entrySet().iterator();
			while(i.hasNext()) {
				Entry<Goods,Integer> e = i.next();
				System.out.print(e.getKey());
				System.out.println(e.getValue());
			}
		}else {
			System.out.println("车中无商品");
		}
	
	}
}
