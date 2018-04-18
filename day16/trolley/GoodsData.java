package day16.trolley;

import java.util.HashSet;
import java.util.Set;

public class GoodsData {
	Set<Goods> set = new HashSet<>();
	
	public Set<Goods> initialize(){
		Goods g1 = new Goods(1, "±Ê¼Ç±¾", 11.5);
		Goods g2 = new Goods(2, "ÎÄ¾ßºÐ", 10.4);
		Goods g3 = new Goods(3, "Ô²Öé±Ê", 9.3);
		Goods g4 = new Goods(4, "ÏðÆ¤²Á", 8.2);
		Goods g5 = new Goods(5, "²Ý¸åÖ½", 7.1);
		set.add(g1);
		set.add(g2);
		set.add(g3);
		set.add(g4);
		set.add(g5);
		return set;
	}
	public Set<Goods> getSet() {
		return set;
	}

	public void setSet(Set<Goods> set) {
		this.set = set;
	}
	
}
