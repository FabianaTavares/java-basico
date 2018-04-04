package lesson4;

public class question2 {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		    Complete the factorial() function below. It should return the product of all the numbers
			from 1 to the parameter n. For example, factorial(5) should return 120 because 1 x 2 x
			3 x 4 x 5 = 120. Think about what kind of loop you want to use to accomplish this.
			Starting code:
		 */

		public int factorial(int n) {
			int factorial = 1;
			for (int i = 1; i <= n; i++) {
				factorial = factorial * i;
			}
			return factorial;
		}

	//}

}
