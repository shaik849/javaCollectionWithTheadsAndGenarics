package javacollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         List<TestComparator> test = new ArrayList<>();
         test.add(new TestComparator("shaik", 1, 10));
         test.add(new TestComparator("ramu", 2, 17));
         test.add(new TestComparator("venu", 3, 12));
         test.add(new TestComparator("surya", 4, 19));
         test.add(new TestComparator("hari", 5, 13));
         System.out.println(test);
         Collections.sort(test);
         System.out.println(test);
         Collections.sort(test, new TestComparator());
         System.out.println(test);
	}
}
