package lessons2;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double balance = 0;
		balance = balance + 20;
		balance = balance - 25;
		balance = balance + 30;
		balance = balance - 25;
		
		if(balance < 0) {
			System.out.println("We're in the red!");
		} else if(balance > 0) {
			System.out.println("We made a profit!");
		} else {
			System.out.println("We broke even.");
		}
		
		/*
		 * The answer is: C We broke even.
		 * The variable balance began at 0. 20 was added, then 25 subtracted, bringing the value to
-5. Then 30 was added, bringing the value to 25. Finally, 25 was subtracted, bringing the
value to 0. Since the conditions balance < 0 and balance > 0 are both false, the else
case is the one that is executed.
		 */
	}

}
