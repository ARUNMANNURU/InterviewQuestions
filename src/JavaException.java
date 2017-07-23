import java.util.Scanner;

/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
/*
 * The My Calculator class and power method are provided for your in the editor
 * The power method has two parameters n and p and it either calculates and 
 * returns n pow p or throws an exception in the event that one or both arguments
 * passed to it are negative
 * 
 * Complete the main method in the solution class so it performs the following tasks
 * 
 * Use scanner class to read successive lines of two space separated integers(in the form of n p)
 * from scanner until no more input is detected
 * 
 * print a line of output for each line of input if n >= 0 and p >= 0 the code must print 
 * the value of n pow p, other wise the code must print java.lang.Exception: n and p should be non-negative 
 * without halting exception
 * 
 * 
 * 
 * 
 * 
 * 
 */


public class JavaException {

	/**
	 * @param args
	 */
	static int power(int n,int p) throws Exception{
		if(n < 0 || p < 0){
			throw new Exception("n and p should be non-negative");
		}
		return (p == 0) ? 1 : n*power(n,p-1);
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n = sc.nextInt();
		System.out.println("Enter the p value:");
		int p = sc.nextInt();
		System.out.println(power(n,p));
	}

}
