public class simplearray {

    int[][] A1;

    public static void main(String[] args) {

        char[] a1[] = { { 'h', 'e', 'l', 'l', 'o', ' ', 'J', 'A', 'V', 'A' } };/*
                                                                                * String str = "abc";
                                                                                * The above declaration is
                                                                                * equivalent to:
                                                                                * char data[] = {'a', 'b', 'c'};
                                                                                * String str = new String(data);
                                                                                */
        int n = a1.length;
        System.out.println("lengthofArray is :" + n);
        for (int i = 0; i < n; i++) {
            System.out.print("Array is genereted:" + " " + new String(a1[i])); /*
                                                                                * fix Must explicitly convert the
                                                                                * char[] to a String
                                                                                */
        }
    }
}
