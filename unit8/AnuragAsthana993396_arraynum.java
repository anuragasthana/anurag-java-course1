public class AnuragAsthana993396_arraynum {

	public final static int EVEN = 0;
	public final static int ODD = 1;

	public static void main(String[] args) {
		int randomNumArry[] = new int[100];
		int evenNumArray[] = new int[100];
		int oddNumArray[] = new int[100];

		for (int a = 0; a < 100; a++) {
			int num = 1 + (int) (25 * Math.random());
			randomNumArry[a] = num;

		}

		int size = sortOdd(randomNumArry, oddNumArray);
		display(oddNumArray, size, ODD);
		size = sortEven(randomNumArry, evenNumArray);
		display(evenNumArray, size, EVEN);
	}

	public static void display(int array[], int size, int type) {

		switch (type) {
		case EVEN:
			System.out.println("EVEN ARRAY:");
			break;
		case ODD:
			System.out.println("ODD ARRAY:");
			break;
		}
		for (int j = 0; j < size; j++) {

			System.out.print(array[j] + " ");

		}
		System.out.println();
	}

	public static int sortEven(int source[], int destination[]) {
		int destIndex = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 2 == 0) {
				destination[destIndex] = source[i];
				destIndex++;
			}
		}
		return destIndex;
	}

	public static int sortOdd(int source[], int destination[]) {
		int destIndex = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 2 == 1) {
				destination[destIndex] = source[i];
				destIndex++;
			}
		}
		return destIndex;
	}
}
