package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TestStream {

	public static void main(String[] args) {
		//������
		IntStream is = IntStream.builder().add(11).add(22).add(33).build();
		//ĩ��--------------------------------------------------------
		//�����
//		System.out.println(is.max().getAsInt());
//		IntStream is1 = IntStream.builder().add(11).add(22).add(33).build();
		//��С��
//		System.out.println(is1.min().getAsInt());
		//��
//		System.out.println(is.sum());
		//ƽ��ֵ
//		System.out.println(is.average().getAsDouble());
		//������ͳ��
//		System.out.println(is.count());
		//���е� Ԫ�� �� ���� ���������� true
/*		System.out.println(is.allMatch(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value>22;
			}
		}));*/
//		System.out.println(is.allMatch(value->value > 22));//false
		//ֻҪ�� һ�� Ԫ�� �������� ��true
//		System.out.println(is.anyMatch(value->value > 22));//true
		//�м�
//		is.filter(value->value > 11).forEach(System.out::println);
		System.out.println(is.filter(value->value > 11).count());
		//---------------------------------------------------------
		//����
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("abc");
		list.add("ccccc");
		list.add("xxx");
		//�ַ����� �� 3����
		list.stream().filter(t -> t.length() == 3).forEach(System.out::println);
		//����
		list.stream().forEach(System.out::println);
		
		
		
	}

}
