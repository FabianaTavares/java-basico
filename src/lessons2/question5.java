package lessons2;

public class question5 {

	public static void main(String[] args) {
		
		/* 
		  	Assume you have access to a double variable called time. Write code that assigns a different
			value to the String variable timeOfDay based on the value of time in hours. If time is
			between 5 and 12, including 5 but not including 12, set timeOfDay to �morning�. If time is
			between 12 and 20, including 12 but not including 20, set timeOfDay to �daytime�. Finally,
			if the time variable does not satisfy either condition, set timeOfDay to �night�.
		 */
		
		//Assume this could have any value between 0 and 24:
		int time = 18;
		String timeOfDay;
		if (time >= 5 && time < 12) {
		timeOfDay = "morning";
		} else if (time >= 12 && time < 20) {
		timeOfDay = "daytime";
		} else {
		timeOfDay = "night";
		}


	}

}
