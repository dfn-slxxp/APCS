public class LoneSum {

	public int loneSum(int a, int b, int c) {

		int aa = (a != b && a != c) ? a : 0;
                int bb = (b != c && b != a) ? b : 0;
                int cc = (c != b && c != a) ? c : 0;

		return aa + bb + cc;

	}

}
