public class dArr01{
    public static void main(String[] args) {
        int[][] A1 = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 }, { 10 } };
        int m = A1.length;
        System.out.println("NewArray " + " ");
        for (int j = 0; j < m; j++) {
            System.out.print(java.util.Arrays.toString(A1[j]));
        }
    }
}
