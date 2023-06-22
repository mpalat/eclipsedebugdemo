package poc;

interface I {
	void apply(String s);
}
public class XLambdaExample {

	public static void main(String[] args) {
		I myprint = (x) -> {
			if (x != null) {
				System.out.println(x);
			} else {
				System.out.println("Dummy");
			}
		};
		myprint.apply("Hello Lambda");
		myprint.apply(null);
		
	}
}
