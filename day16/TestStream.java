package day16;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TestStream {

	public static void main(String[] args) {
		//创建流
		IntStream is = IntStream.builder().add(11).add(22).add(33).build();
		//末端--------------------------------------------------------
		//最大数
//		System.out.println(is.max().getAsInt());
//		IntStream is1 = IntStream.builder().add(11).add(22).add(33).build();
		//最小数
//		System.out.println(is1.min().getAsInt());
		//和
//		System.out.println(is.sum());
		//平均值
//		System.out.println(is.average().getAsDouble());
		//个数的统计
//		System.out.println(is.count());
		//所有的 元素 都 满足 条件，返回 true
/*		System.out.println(is.allMatch(new IntPredicate() {
			
			@Override
			public boolean test(int value) {
				return value>22;
			}
		}));*/
//		System.out.println(is.allMatch(value->value > 22));//false
		//只要有 一个 元素 满足条件 ，true
//		System.out.println(is.anyMatch(value->value > 22));//true
		//中间
//		is.filter(value->value > 11).forEach(System.out::println);
		System.out.println(is.filter(value->value > 11).count());
		//---------------------------------------------------------
		//集合
		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("abc");
		list.add("ccccc");
		list.add("xxx");
		//字符个数 是 3个的
		list.stream().filter(t -> t.length() == 3).forEach(System.out::println);
		//遍历
		list.stream().forEach(System.out::println);
		
		
		
	}

}
