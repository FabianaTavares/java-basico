package lessons2;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean canSeePlayer = true;
		boolean playerPoweredUp = false;
		
		if(canSeePlayer) {
			if (!playerPoweredUp) {
				System.out.println("ATTACK!");
			}
			else {
				System.out.println("Run away");
			}
		}else {
			System.out.println("Wander.");
		}
		
	}

}
