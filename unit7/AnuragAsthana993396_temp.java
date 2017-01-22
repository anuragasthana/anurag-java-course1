public class AnuragAsthana993396_temp {

	public static void main(String[] args) {
		float celsius;

		celsius = Input.getFloat("Please enter a value in degrees Celsius to convert to Fahrenheit.");
		
		System.out.println("Degrees Celsius: " + celsius);
		System.out.println("Degrees Fahrenheit:" + celsiusToFarenheit(celsius));
		System.out.println();
		
		

		float far;

		far = Input.getFloat("Please enter a value in degrees Fahrenheit to convert to Celsius.");
		
		System.out.println("Degrees Fahrenheit: " + far);
		System.out.printf( "Degrees Celsius: "+ "%.2f",farenheitToCelsius(far));
		System.out.println();

	}

	public static float celsiusToFarenheit(float x) {

		float y = (float) ((x * 1.8) + 32);
		return y;

	}

	public static float farenheitToCelsius(float a) {

		float b = (a - 32) * ((float) 5 / 9);
		return b;

	}

}
