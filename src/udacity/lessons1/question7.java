package udacity.lessons1;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		    Question 7
			Write Java code to define a double variable called fahrenheit and set it to an initial value
			between 0 and 100. Then, create a double variable called celsius, and calculate its value
			based on the value of fahrenheit. (To convert from Fahrenheit to Celsius, subtract 32,
			then multiply by 5, then divide by 9.) Finally, print the final value of celsius
		 */
		
		double fahrenheit = 68.0;
		double celcius;
		celcius = (fahrenheit - 32) * 5/9;
		System.out.println("The value is: " + celcius);
		
	}

}
