public class Tester {
    public static void main(String[] args) {
        int[] inputTestCases = {1, 2, 3, 100, 200, 500, 10000};
        int[] expectedOutputs = {2, 3, 5, 541, 1223, 3571, 104729};

        for (int i = 0; i < inputTestCases.length; i++) {
            testCase(inputTestCases[i], expectedOutputs[i]);
        }
    }

    public static void testCase(int input, int expectedOutput) {
        int output = nthPrime(input);

        if (output == expectedOutput) System.out.println("PASS: expected " + expectedOutput + ", returned " + output);
        else {
            System.out.println("FAIL: expected " + expectedOutput + ", but value returned was " + output);
        }
    }

    public static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }

    public static int nthPrime(int n) {
        if (n == 0) return 2;
        int counter = 0;
        int i = 2;
        for ( ; ; i++) {
            if (isPrime(i)) {
                counter ++;
                if (counter == n) break;
            }
        }
        return i;
    }
}