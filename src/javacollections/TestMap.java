package javacollections;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "name");
		map.put(2, "name");
		map.put(3, "name");
		System.out.println(map);
		for(Map.Entry<Integer, String> myMap : map.entrySet()) 
			System.out.println(myMap.getValue() + ":"+ myMap.getKey());

	}

}
