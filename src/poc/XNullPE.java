package poc;

public class XNullPE {

	private static int foo(Object o, Object a) {
		return o.hashCode() + a.hashCode();
	}
	public static void main(String[] args) {
		foo(new XNullPE(), null);
	}
}
