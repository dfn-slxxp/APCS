public class In1To10 {

	public boolean in1To10(int n, boolean outsideMode) {

		return (1 <= n && n <= 10 && !outsideMode) || ((n <= 1 || n >= 10) && outsideMode);

	}

}
