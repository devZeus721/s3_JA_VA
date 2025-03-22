public class Studentstr {
    String nam;
    String idno;
    int age;
    char div;

    public static void main(String[] args) {
        Studentstr st1 = new Studentstr();
        Studentstr st2 = new Studentstr();
        st1.nam = "James Steve";
        st2.nam = "Roger Federer";
        st1.idno = "3433";
        st2.idno = "3434";
        st1.age = 21;
        st1.age = 22;
        st1.div = 'D';
        st1.div = 'E';
        System.out.println("Idno of Student 1:" + st1.idno + " ");
        System.out.println("Name: " + st1.nam);
        System.out.println("Age & Div: " + st1.age + "  " + st1.div);
        System.out.println("Idno of Student 2: " + st2.idno + " ");
        System.out.println("Name: " + st2.nam);
        System.out.println("Age & Div: " + st1.age + "  " + st1.div);
    }
}