package lessons2;

public class question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Assume this can have any value from 1 to 7:
		int dayOfWeek = 1;
		String schedule;

		switch(dayOfWeek) {
		
			case 1:
				schedule = "Gym in the morning.";
				break;
			case 2:
				schedule = "Class after work.";
				break;
			case 3:
				schedule = "Meetings all day.";
				break;
			case 4:
				schedule = "Work from home.";
				break;
			case 5:
				schedule = "Game night after work.";
				break;
			case 6: case 7: default:
				schedule = "Free!";
				break;	
		}

	}

}
