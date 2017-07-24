import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class JavaInheritance extends Arithmetic{

	/**
	 * @param args
	 */
	/*
	 * An abstract class named Arithmetic and an abstract method named add are declared in the locked
	 * portion of the editor.Write a class named Adder that inherits from the Arithmetic class.The Adder 
	 * class must implements the add method which has two integer parameters, a and b, and calculates and returns
	 * the sum of a and b.
	 * 
	 *  Input:
	 *  Locked stub code in the editor reads the following input from stdin and passes it to the function:
	 *  The first line contains an integer,a
	 *  The second line contains an integer,b
	 * 
	 * 
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the value of a:");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();
		JavaInheritance jIn = new JavaInheritance();
		System.out.println(jIn.add(a, b));
	}

	@Override
	int add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

}
