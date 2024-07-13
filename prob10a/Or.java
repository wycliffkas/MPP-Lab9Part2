package lesson9.labs.prob10a;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		Or or = new Or();
		boolean result = or.someSimpleIsTrue(list);
		System.out.println(result);
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
		return list.stream()
				.map(s -> s.flag)
				.reduce(false, (x, y) -> x || y);
	}

}
