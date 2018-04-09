package lessons2;

public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assume these could have any value:
		int weekday = 5;
		boolean holiday = false;
		
		if (weekday >= 1 && weekday <= 5 && !holiday) {
			System.out.println("Wake up at 7:00");
		} else {
			System.out.println("Sleep in!");
		}
	}

}
