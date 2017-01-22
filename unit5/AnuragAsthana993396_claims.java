public class AnuragAsthana993396_claims {

	public static void main(String[] args) {
		int age = 25;
		int claims = 2;
		int policyIncrease = 0;

		if (age < 25 && claims == 0) {
			policyIncrease += 0;
		} else if (age < 25 && claims > 0) {
			policyIncrease += 100;
		} else if (age >= 25 && claims == 0) {
			policyIncrease += 0;
		} else if (age >= 25 && claims > 0) {
			policyIncrease += 50;
		}

		System.out.println();
		System.out.println("Age= " + age + " Claims= " + claims
				+ " Policy Increase= $" + policyIncrease);

	}

}
