/**
 * ch_3
 */
public class ch_3 {
	public static void main(String[] args) {
		Long num1 = 600851475143L;
		Long numCheck = 600851475142L;

		boolean found = false;

		while(!found) {
			if(num1 % numCheck == 0) {
				if(numCheck % 2 != 0 && numCheck % 5 != 0) {
					found = true;
				}
			}
			numCheck--;
			System.out.println(numCheck);
		}

		System.out.println("Largest Prime Factor: " + numCheck);
	}
}