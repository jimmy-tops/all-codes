package HomePracticeJava;

public class Foorloop {

	public static void main(String[] args) {

		int l, n, k;
		for (k = 0; k <= 9 - 1; k++) {

			for (l = 0; l <= 9; l++) {
				for (n = 0; n <= l; n++) {
					
					System.out.print("*");
				}
				System.out.println("");
			}

		}

	}
}