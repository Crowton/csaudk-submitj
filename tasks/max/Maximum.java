// Version: 2018010101
import java.io.*;
import java.util.*;
public class Maximum {
    public int computeMaximum(ArrayList<Integer> input) {
        // Implement your code here to return the maximum!
        return input.get(0);
    }

    public static void testAll() {
        clearTerminal();
        test1();
        test2();
    }

    public static void test1() {
        int[] input = { 96, 66, 82, 63, 78, 37, 100, 96, 98, 17, 13, 7, 28, 74, 73, 77, 41, 25, 53, 93 };
        int correctAnswer = 100;
        runTest("test1", input, correctAnswer);
    }

    public static void test2() {
        int[] input = { 90, 8, 38, 69, 82, 79, 67, 27, 17, 46, 78, 14, 47, 18, 36, 55, 55, 74, 12, 95 };
        int correctAnswer = 95;
        runTest("test2", input, correctAnswer);
    }

    private static void runTest(String testName, int[] input, int correctAnswer) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i : input) list.add(i);

        try {
            int output = new Maximum().computeMaximum(list);

            if (output != correctAnswer)
                outputFail(testName,
                           "Expected output " + correctAnswer +
                           " but got " + output);
            else
                outputPass(testName);
        } catch (Exception e) {
            e.printStackTrace();
            outputFail(testName,
                       "Exception: " + e);
        }
    }

    private static void clearTerminal() {
        System.out.print('\u000C');
    }

    private static void outputPass(String testName) {
        System.out.println("[Pass " + testName + "]");
    }

    private static void outputFail(String testName, String message) {
        System.out.println("[FAIL " + testName + "] " + message);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        if (testcases == 0) testAll();
        for (int t = 0; t < testcases; ++t) {
            int n = sc.nextInt();
            ArrayList<Integer> list = new ArrayList<Integer>();
            for (int i = 0; i < n; ++i) list.add(sc.nextInt());
            System.out.println(new Maximum().computeMaximum(list));
        }
    }
}
