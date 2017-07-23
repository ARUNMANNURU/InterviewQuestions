/**
 * 
 */

/**
 * @author ArunMannuru
 *
 */

/*
 * Find out put of the program
 * 
 */

public class OutPutOfProgram {

	/**
	 * @param args
	 */
	class Inner{
		void test(){			// Control here and executes this function step: 4
			if(OutPutOfProgram.this.flag){ // checks whether this is set to true or false step: 5
				sample();			// calling this function step: 6
			}
		}
	}
	private boolean flag = true;
	public void sample(){		// function executed step: 7
		System.out.println("Sample");
	}
	public OutPutOfProgram(){
		(new Inner()).test(); // Calling test method of Inner class Step: 3
	}
	public static void main(String[] args) {  // Execution Starts  Step:1
		// TODO Auto-generated method stub
		new OutPutOfProgram();  			// Calls Constructor of Class  Step:2
	}

}

/*		OUTPUT : Sample   */