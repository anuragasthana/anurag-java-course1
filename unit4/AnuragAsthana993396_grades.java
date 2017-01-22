public class AnuragAsthana993396_grades {

	public static void main(String[] args) {
		
		int grade1= 85;
		int grade2= 95;
		
		int average= ( grade1 + grade2 ) / 2;
		
		System.out.println("Your average grade on these tests are "+ average +"%");
		
		if (average>=90){
			if (average<=100){
				System.out.println("You have an A.");
			}
			
		}
		
		if (average>=80){
			if (average<90){
				System.out.println("You have a B.");
			}
			
		}
		
		if (average>=70){
			if (average<80){
				System.out.println("You have a C.");
			}
			
		}
		
		if (average>=65){
			if (average<70){
				System.out.println("You have a D.");
			}
			
		}
		
		if (average<65){
			System.out.println("You have a F.");
		}
		
	}

}
