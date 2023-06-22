package poc;
public class X {
	public static int count;
	public static int delta;

	public String hello(String name) {
		return "Hello " + name;
	}
	
	public static void main(String[] args) {
		X x = new X();
		String name =  args.length > 0 ? args[0] : "World";
		String ret = x.hello(name);
		System.out.println(ret);

		foo(x);
		
	}
	
	public static void foo(X x) {
		String s = System.getenv("JCON_ENV_HELLO_NAME");
		if (s != null) {
			System.out.println(x.hello(s));
		}
		s = System.getenv("TMP");
		if (s != null) {
			System.out.println(x.hello(s));
		}
		int xx = 10;
//		count = 10;
		++count;
		if (count %2 == 0) {
			System.out.println(count + " is even count");
		}
	} 
}
