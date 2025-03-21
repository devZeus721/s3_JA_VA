
public class mainOperators {
	public static void main(String[] args) {
		int ans = 7;
		System.out.println("Ans is " + ans);
		int ans2 = 5;
		System.out.println("Subtract is " + (ans - ans2));// Arithmatic Operator
		System.out.println("Checking1 " + (ans == ans2));//
		System.out.println("Checking2 " + (ans != ans2));//
		System.out.println("Checking3 " + (ans & ans2));// Bitwise Operator

		boolean b1 = true, b2 = false;
		System.out.println("Checking4 " + (b1 == b2));// Relational Operator
		System.out.println("Checking5 " + (b1 && b2));// Logical Operator
		System.out.println("Checking6 " + (b1 || b2));
		System.out.println("Checking7 " + (!(b1 && b2)));
		System.out.println("ValueOfans&ans2:" + ans + ans2);
		ans2 = (ans == 8) ? 7 : 5;// Conditional Operator
		System.out.println("ValueOfans2:" + ans2);

		int a = 6;// Assignment Operator
		System.out.println(a++);// Postfix Increment
		System.out.println(++a);// Prefix Increment
		System.out.println(a--);// Postfix Decrement
		System.out.println(--a);// Prefix Decrement
	}
}
