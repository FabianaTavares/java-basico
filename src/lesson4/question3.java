package lesson4;

public class question3 {

	public int indexOfFirstOccurrence(String[] stringArray, String target)
	{
		for (int i = 0; i < stringArray.length; i++) {
			if (stringArray[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	
}
