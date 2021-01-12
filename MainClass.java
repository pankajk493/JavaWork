package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		Set<String> fruits=new HashSet<>();
//		fruits.add("Apple");
//		fruits.add("Banana");
//		fruits.add("Kiwi");
//		fruits.add("Kiwi");
//
//		System.out.println(fruits);
		Set<Integer> x=new HashSet<>();
		x.add(23);
		x.add(43);
		x.add(12);
		Set<Integer> y=new HashSet<>();
		//y.add(56);
		y.add(43);
		//y.add(28);
//		x.addAll(y);
		//x.retainAll(y);
		System.out.println(x.containsAll(y));
		System.out.println(x);

	}

}
