public class AnuragAsthana993396_eggs {

	public static void main(String[] args) {
		int N= 11;
		//int N= 37;
		int eggsInaCarton= 12;
		int totalCartons= N / eggsInaCarton;
				
		System.out.println("Total number of eggs is "+ N);
		System.out.println("Total number of cartons needed is "+ totalCartons);
				
		int remainder= N % eggsInaCarton;
	
		
		System.out.println("Number of eggs left over is "+ remainder);
		

	}

}
