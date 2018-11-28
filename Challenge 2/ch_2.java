/**
 * ch_2
 */
public class ch_2 {
	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int k = 0;
		int total = 0;

		while(k < 4000000) {
			k = i + j;
			i = j;
			j = k;

			if (k % 2 == 0) {
				total = total + k;
			}
		}

		System.out.println("Total: " + total);
	}
}