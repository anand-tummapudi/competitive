import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapDebug {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Map<String,Integer> map = new HashMap<>();
		 * 
		 * String s1 = "FB"; String s2 = "Ea";
		 * 
		 * System.out.println(s1.hashCode()); System.out.println(s2.hashCode());
		 * 
		 * map.put(s1, 1); map.put(s2, 1);
		 * 
		 * map.put("bbb", 2); map.put("ccc", 3);
		 * 
		 * map.put(null, 4);
		 */
		
		findCount();

	}

	public static void findCount() {

		Integer[] listOfValues = { 1, 2, 3, 4, 5, 4, 5, 2, 3, 5, 7, 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 3, 2, 4 };

		Map<Integer, Integer> result = new HashMap<>();

		for (Integer integer : listOfValues) {
			if (result.containsKey(integer)) {
				result.put(integer, result.get(integer) + 1);
			} else {
				result.put(integer, 1);
			}
		}

		System.out.println(Arrays.asList(result));
	}

}
