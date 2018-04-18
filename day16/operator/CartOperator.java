package day16.operator;

import java.util.ArrayList;
import java.util.List;

/**车*/
public class CartOperator {
	//车
	private List<Goods> cart = new ArrayList<>();
	//添加
	public void add(Goods goods) {
		cart.add(goods);
	}
	//修改
	public void modify(int no,int count) {
		for(Goods g :cart) {
			if(g.getNo() == no) {
				g.setCount(count);//修改个数
				break;
			}
		}
	}
	//删除
	public void delete(int no) {
		for(Goods g:cart) {
			if(g.getNo() == no) {
				cart.remove(g);
				break;
			}
		}
	}
	//查询
	public void queryAll() {
		if(cart.size() > 0) {
			System.out.println("商品编号\t商品名称\t商品单价\t商品数量");
			
			cart.forEach(System.out::println);
		}else {
			System.out.println("无商品信息");
		}
	
	}
}
