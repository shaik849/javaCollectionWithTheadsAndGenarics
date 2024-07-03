package javacollections;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		for(int i=0;i<10; i++) {
			list.add(i);
			}
		System.out.println(list);
		List<Integer> list2 = new ArrayList<>(list);
		System.out.println(list2);
		list.set(0, 10);
		System.out.println(list);
		list.forEach((x) -> System.out.println(x));
	}

}
