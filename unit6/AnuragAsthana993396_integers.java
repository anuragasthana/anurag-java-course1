public class AnuragAsthana993396_integers {

	public static void main(String[] args) {
		int num = 0;
		int even = 0;
		int odd = 0;

		while (num <= 25) {
			if (num % 2 == 0) {
				even += num;
			} else {
				odd += num;
			}

			num++;
		}

		System.out.println("Sum of even integers is " + even);
		System.out.println("Sum of odd integers is " + odd);

	}

}