/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */
public class StringSimilarity {

	/**
	 * @param args
	 */
	static /*
	 * From two strings A and B we define the similarty of the two strings to be the
	 * length of the integers of the longest prefix common to both strings
	 * for example the similarity of strings abc and abd is 2, while the similarity of strings
	 * aaa and aaab is 3.
	 * Calculate the sum of similarities of a string S with each of its suffixes, including 
	 * the string itself as the first suffix.
	 * 
	 * Input;
	 * The first line contains the number of test cases. T Next subsequence lines contains a string
	 * representing the values of string s for each test case.
	 * 
	 * 
	 */
	void stringSimilarity(String strA){
		
		int sim = 0;
		char[] charArray = strA.toCharArray();
			int n = charArray.length;
			for (int i = 0; i < n; i++) {
				for (int j = i; j < n; j++) {
					if (charArray[j - i] == charArray[j])
						sim++;
					else
						break;
				}
			}
			System.out.println(sim);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strA = "ababaa";
		stringSimilarity(strA);
	}

}
