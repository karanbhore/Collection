package concurrentModificationException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ConcurrentModificationExceptionDemo {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		for (char i = 'a'; i < ('a' + 10); i++) {
			list.add(i);
		}

		list.add("a");
		list.add("d");
		list.add("c");
		list.add("b");

		System.out.println(list);

		for (Object letter : list) {
			System.out.println(letter);
			if (letter.equals("c")) {
				list.remove(letter);
			}
//			System.out.println(list);

		}
		System.out.println("<<<>>>>>>>");
		Iterator ltr = list.iterator();
		while (ltr.hasNext()) {
			System.out.println(ltr.next());
			list.add("z");
//			list.remove("a");
		}
		System.out.println(list);
	}

}
