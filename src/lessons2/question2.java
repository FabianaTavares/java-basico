package lessons2;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dogs = 1;
		int cats = 2;
		
		if (dogs > 0 && cats == 0) {
			
			if(dogs > 1) {
				System.out.println("Dog lover");
			} else {
				System.out.println("dog person");
			}
			
		} else if(cats > 0 && dogs == 0) {
			if(cats > 1) {
				System.out.println("Cat lover");
			} else {
				System.out.println("Cat person");
			}
			System.out.println("Meow!");
			
		} else if (cats > 0 && dogs > 0) {
			if(dogs > cats) {
				System.out.println("I guess you like dogs more");
			} else if (dogs == cats) {
				System.out.println("I guess you like both equally");
			} else {
				System.out.println("I guess you like cats more");
			}
			
		} else {
			System.out.println("What, don't you like pets?");
		}
	}
	
	/*
	 * The answer is: I guess you like cat more
	 */

}
