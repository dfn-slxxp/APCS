public class HasTeen {

	public boolean hasTeen(int a, int b, int c) {

		return isTeen(a) || isTeen(b) || isTeen(c);

	}

	public boolean isTeen(int n) { return n <= 19 && n >= 13; }

}
