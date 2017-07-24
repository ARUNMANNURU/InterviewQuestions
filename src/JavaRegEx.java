/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class JavaRegEx {

	/**
	 * @param args
	 */
	/*
	 * IPv4 was the fist publicly used internet protocol.It used 4-byte address and premitted 2 pow 32 distinct values.
	 * The typical format for an IPv4 address is A,B,C,D where A,B,C and D are all integers in the inclusive range between
	 * 0 and 255.lending zeros are allowed,but the lengths of A,B,C and D cannot be larger than 3 digits.See the examples below for more detail.
	 * 
	 *  Sample Valid IP Address
	 *  
	 *  000.12.12.034
	 *  121.234.12.12
	 *  23.45.12.56
	 *  0.1.2.3
	 *  
	 *  Sample invalid IP address
	 *  
	 *  000.12.234.23.23
	 *  666.666.23.23
	 *  .213.123.23.32
	 *  23.45.22.32
	 *  I.Am.not.an.ip
	 *  
	 *  Complete the following:
	 *  1.Write a regular expression that can be used to validate an IPv4 address and assign it to the static String pattern variable that's 
	 *  provided in the editor/
	 *  2.Complete the provided class constructor for MyRegex.It has one parameter,String iP, denoting a potential IPv4 address that must be saved to an 
	 *  instance variable declared by you.
	 *  3.Complete the provided isMatch method so it returns a boolean denoting whether or not the value of the arguments passed to the MyRegex class constructor 
	 *  matches the pattern RegEx.
	 * 
	 * 
	 */
	private static String pattern ="(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)\\.(\\d{1,2}|[01]\\d{2}|2[0-5]\\d)";
	
	String iP;
	
	public JavaRegEx(String iP){
		this.iP = iP;
	}
	public boolean isMatch(){
		return this.iP.matches(this.pattern);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iP = "000.12.234.23.23";
		JavaRegEx jReg = new JavaRegEx(iP);
		System.out.println(jReg.isMatch());
	}

}
