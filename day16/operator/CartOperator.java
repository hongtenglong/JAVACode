package day16.operator;

import java.util.ArrayList;
import java.util.List;

/**��*/
public class CartOperator {
	//��
	private List<Goods> cart = new ArrayList<>();
	//���
	public void add(Goods goods) {
		cart.add(goods);
	}
	//�޸�
	public void modify(int no,int count) {
		for(Goods g :cart) {
			if(g.getNo() == no) {
				g.setCount(count);//�޸ĸ���
				break;
			}
		}
	}
	//ɾ��
	public void delete(int no) {
		for(Goods g:cart) {
			if(g.getNo() == no) {
				cart.remove(g);
				break;
			}
		}
	}
	//��ѯ
	public void queryAll() {
		if(cart.size() > 0) {
			System.out.println("��Ʒ���\t��Ʒ����\t��Ʒ����\t��Ʒ����");
			
			cart.forEach(System.out::println);
		}else {
			System.out.println("����Ʒ��Ϣ");
		}
	
	}
}
