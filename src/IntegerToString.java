/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class IntegerToString {

	/**
	 * @param args
	 */
	
	/*
	 * 
	 * 	Given integer convert into string of words respect to digit.
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123;
		convertToString(num);
	}
	static void convertToString(int num){
		 
		String strNum = null;
		strNum = String.valueOf(num);
		char[] ch = strNum.toCharArray();
		
		for(int i=0; i < strNum.length(); i++){
			switch(ch[i]){
			
			case '1': System.out.print("one");
					break;
			case '2': System.out.print("two");
					break;
			case '3': System.out.print("three");
					break;
			
			}
		}
	}

}
