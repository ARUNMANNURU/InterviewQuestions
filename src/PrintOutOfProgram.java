/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class PrintOutOfProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		divide(4,0);
	}

	static int divide(int a,int b){
		int c = -1;
		try{
			c = a/b;
		}catch(Exception e){
			System.err.print("Exception ");
		}
		finally{
			System.err.println("Finally ");
		}
		return c;
	}
}

/*  OutPut: Exception Finally  */