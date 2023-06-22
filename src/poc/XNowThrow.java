package poc;

public class XNowThrow {

	public static int catchAIOOBE(int[] a) {
		try {
			a[a.length] = 10;			
		} catch (ArrayIndexOutOfBoundsException e){
			return -1;
		}
		return 0;
	}

	public static int throwAIOOBE(int[] a) {
		if (a != null) {
			a[a.length] = 10;
		}
		return 0;
	}

	public static void main(String[] args) {
		catchAIOOBE(new int[5]);
		throwAIOOBE(new int[5]);
	}
}
