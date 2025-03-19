import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out .println("The World is too cruel i see still now yet, need to discover up soon");
        String u = "I am a programmer great WORLD done!";
        System.out.println(u);
        int a,b,c;
        System.out.println("Enter the first number");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("The first number is: " + a);
        System.out.println("Enter the second number");
        b = s.nextInt();
        System.out.println("The second number is: " + b);
        System.out.println("The sum of both numbers is: " + (a+b));
        System.out.println("The difference of both numbers is: " + (a-b));
        System.out.println("The product of both numbers is: " + (a*b));
        System.out.println("The division of both numbers is: " + (a/b));
        System.out.println("The modulus of both numbers is: " + (a%b));
        System.out.println("The power of both numbers is: " + (Math.pow(a,b)));
        System.out.println("The square root of the first number is: " + (Math.sqrt(a)));
        System.out.println("The square root of the second number is: " + (Math.sqrt(b)));
        System.out.println("The square root of the sum of both numbers is: " + (Math.sqrt(a+b)));
        System.out.println("The square root of the difference of both numbers is: " + (Math.sqrt(a-b)));

    }
    
}
