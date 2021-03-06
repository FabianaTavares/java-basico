package udacity.lessons1;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 	What value will be printed by this line of Java code?
			System.out.println(2.0 * (5 / 2));
			A. 4
			B. 4.0
			C. 5
			D. 5.0
			E. This line of code will give an error.
		 */
		
			System.out.println(2.0 * (5/2));
			
			/*
			 * The answer is 4.0 because
			    When evaluating the arithmetic expression 2.0 * (5 / 2), Java will evaluate the expression
				inside the parentheses, 5 / 2. When dividing two integers, Java will take ignore the
				remainder, so 5 / 2 evaluates to the integer 2, not the double 2.5. This process is called
				truncation. The second step in evaluating the expression is evaluating 2.0 * 2. When
				multiplying a double and an integer, the result is a double, so the value printed is the double
				4.0.

			 */

	}

}
