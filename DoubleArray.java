public class DoubleArray {
    public static void main(String[] args) {
        double[][] A1 = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 }, { 10 } };
        int m = A1.length;
        for (int j = 0; j < m; j++) {
            System.out.print("NewArray " + " " + java.util.Arrays.toString(A1[j]));
        }
    }
}
