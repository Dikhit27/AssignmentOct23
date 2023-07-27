package genericsAssignment;

import java.util.HashMap;
import java.util.Map;

public class StoreInt {

	public static void main(String[] args) {

		Map<Integer, Double> map = new HashMap<>();

		map.put(1, 1.0);
		map.put(2, 2.0);
		map.put(3, 3.0);
		map.put(4, 4.0);
		map.put(5, 5.0);
		map.put(6, 6.0);
		map.put(7, 7.0);
		map.put(8, 8.0);
		map.put(9, 9.0);
		map.put(10, 10.0);

		for (Map.Entry<Integer, Double> m : map.entrySet()) {
			System.out.println(m.getKey() + "  =  " + m.getValue());
		}

	}

}
