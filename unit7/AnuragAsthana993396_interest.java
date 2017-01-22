public class AnuragAsthana993396_interest {

	public static void main(String[] args) {
		System.out.println("Welcome to the Interest Calculator!!");

		float Principal =Input .getFloat("What is the original amount?");
		float rate = Input
				.getFloat("What is the interest rate in percentage?");
		rate = (float) (rate/100.00);
		float numYears = Input.getFloat("How many years?");

		float amountfinal = interest(Principal, rate, numYears);

		System.out.printf("The final amount is $" + "%.2f",(float)amountfinal);

	}

	public static float interest(float x, float y, float z) {
		float rate = (1 + y);
		float amount = (float) (x * Math.pow(rate, z));

		return amount;
	}

}
