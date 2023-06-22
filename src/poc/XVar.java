package poc;

import java.util.HashMap;
import java.util.Map;

public class XVar {
	private void foo(Y y) {
		if (y.age < 10) {
			System.out.println("name:"+ y.name);
		}
		System.out.println(y);
	}

	private static Y createCrazyY(int n) {
		Y y = new Y();
		y.name = "Crazy";
		Map<String, Integer> m = new HashMap<>();
		Integer[] noOfSteps = new Integer[n];
		for (int i = 0; i<n; ++i) {
			m.put(Integer.toString(i), i);
			noOfSteps[i] = i;
		}
		y.nMap = m;
		y.noOfSteps = noOfSteps;
		y.age = n/10;
		return y;
	}
	
	public static void main(String[] args) {
		Y y = createCrazyY(100);
		new XVar().foo(y);
	}
}


class Y {
	String name;
	Map<String, Integer> nMap;
	Integer[] noOfSteps;
	Integer age;
}