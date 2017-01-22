public class AnuragAsthana993396_stringcount {

	public static void main(String[] args) {
		String source = Input.getString("What do you want to say?");
		source = source.toLowerCase();
		display(record(source));
	}

	public static int[] record(String b) { // Recording the string values in an
											// array
		char abc[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k',
				'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w',
				'x', 'y', 'z' };
		int letterCount[] = new int[26];
		for (int j = 0; j < abc.length; j++) {
			for (int i = 0; i < b.length(); i++) {
				if (b.charAt(i) == (abc[j])) {
					letterCount[j] += 1;
				}
			}

		}

		return letterCount;

	}

	public static void display(int array[]) { // Display method for the array
		char abc[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
				'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W',
				'X', 'Y', 'Z' };
		for (int j = 0; j < abc.length; j++) {
			System.out.println("Letter " + abc[j] + " count= " + array[j]);

		}
		System.out.println();
	}

}
