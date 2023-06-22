package poc;
public class XB {
	public static int count;
	public static int delta;

	
	public static void main(String[] args) {
		bar(6);
	}
	
	public static int bar(int d) {
		int local = 1;
		for (int i = 1; i <= d; ++i) {
			delta = i % 2;
			local = delta + 1;
		}
		if (d > 0) {
			System.out.println("d="+d);
		}
		if (local %2 == 0) {
			return 2;
		}
		return local;
	}
	public String hello(String name) {
		return "Hello " + name;
	}

}
