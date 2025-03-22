public class simplearray {
    public static void main(String[] args) {
        double[][] A1 = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9 }, { 10 } };
        char[] a1[] = { { 'h', 'e', 'l', 'l', 'o', ' ', 'J', 'A', 'V', 'A' } };/*
                                                                                * String str = "abc" The above
                                                                                * declaration is equivalent to: char
                                                                                * data[] = {'a', 'b', 'c'};
                                                                                * String str = new String(data);
                                                                                */
        int n = a1.length;
        System.out.println("lengthofArray is :" + n);
        for (int i = 0; i < n; i++) {
            System.out.print("Array is genereted:" + " " + new String(a1[i]));
            /* fix Must explicitly convert the char[] to a String */
            int m = A1.length;
            for (int j = 0; i < m; j++) {
                System.out.print("NewArray " + " " + (A1[j]));
            }
        }
    }
}
