package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@FunctionalInterface
interface StringToIntMapper {
	int mapToInt(String str);

	boolean equals(Object str);
}

// class SomeClass implements StringToIntMapper {
// @Override
// public int mapToInt(String str) {
// return str.length();
// }
// }

public class Lambda_Expression_Ex {

	public static void main(String[] args) {

		// SomeClass instance=new SomeClass();
		// int len=instance.mapToInt("Nag");
		// System.out.println(len);

		// ------------------------------------------

		// StringToIntMapper instance = s -> s.length();
		// System.out.println(instance.mapToInt("Nag"));

		// -----------------------------------------

		List<String> strings = new ArrayList<>();
		strings.add("B");
		strings.add("C");
		strings.add("A");

		// Collections.sort(strings,new Comparator<String>() {
		// public int compare(String o1, String o2) {
		// return o2.compareTo(o1);
		// };
		// });

		Comparator<String> c = (String s1, String s2) -> s2.compareTo(s1);
		Collections.sort(strings, c);

		System.out.println(strings);

		// -------------------------------------------------

	}

}
