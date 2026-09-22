public class RoundSum {

	public int roundSum(int a, int b, int c) {

		return round10(a) + round10(b) + round10(c);

	}

	public int round10(int n) {

		int lastDigit = n % 10;
		return (lastDigit >= 5) ? (n - lastDigit + 10) : (n - lastDigit);

	}

}
