/* String & Object Usage comes here */
public class Studentstr {
    String name; // initializing String
    String idno; // initializing String
    int age;
    char div;

    public static void main(String[] args) {

        Studentstr st1 = new Studentstr(); // object creation
        Studentstr st2 = new Studentstr(); // object creation

        st1.name = "James Steve"; // string representing
        st2.name = "Roger Federer"; // string representing
        st1.idno = "3433";
        st2.idno = "3434";
        st1.age = 21;
        st2.age = 22;
        st1.div = 'D';
        st2.div = 'E';

        System.out.println(" ");
        System.out.println("DETAILS of Students");
        System.out.println(" ");
        System.out.println("Idno of Student 1: " + st1.idno + " "); // string printing with whitespace
        System.out.println("Name: " + st1.name);
        System.out.println("Age & Div: " + st1.age + "  " + st1.div);
        System.out.println("Idno of Student 2: " + st2.idno + " "); // string printing with whitespace
        System.out.println("Name: " + st2.name);
        System.out.println("Age & Div: " + st2.age + "  " + st2.div);
    }
}
