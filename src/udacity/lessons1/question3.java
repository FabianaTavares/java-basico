package udacity.lessons1;

public class question3 {

	/*
	 	Define an integer variable called bankBalance. Initialize it to a 
	 	value of 500. Then add 250
		to it. Then subtract 100 from it. Finally, print the resulting value.

	 */
	public static void main(String[] args) {
	
		int bankBalance = 500;
		bankBalance = bankBalance + 250;
		bankBalance = bankBalance - 100;
		
		System.out.println("The result is:" + bankBalance);
		
	}	
}
