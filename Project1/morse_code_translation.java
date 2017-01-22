public class morse_code_translation {

	//the values of the morse letters
	static final String morseValues[] = { ".- ", "-... ", "-.-. ", "-.. ",
			". ", "..-. ", "--. ", ".... ", ".. ", ".--- ", "-.- ", ".-.. ",
			"-- ", "-. ", "--- ", ".--. ", "--.- ", ".-. ", "... ", "- ",
			"..- ", "...- ", ".-- ", "-..- ", "-.-- ", "--.. ", ".---- ",
			"..--- ", "...-- ", "....- ", "..... ", "-.... ", "--... ",
			"---.. ", "----. ", "----- ", "| ", "", "", "", "", "" };

	//the equivalent values of the english letters
	static final char englishValues[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g',
			'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
			'u', 'v', 'w', 'x', 'y', 'z', '1', '2', '3', '4', '5', '6', '7',
			'8', '9', '0', ' ', '!', '.', '?', '-' };

	public static void main(String[] args) {
		short pickLang;

		// get user input
		pickLang = Input
				.getShort("To translate from English to Morse, press 1." + "\n"
						+ "To translate from Morse to English, press 2."); 

		if (pickLang == 1) {
			String englishInput = Input
					.getString("What would you like to say in English to translate?");

			// display result of translating text to morse
			System.out.println(translatetoMorse(englishInput.toLowerCase())); 

		} else if (pickLang == 2) {
			String morseInput = Input
					.getString("What would you like to say in Morse to translate?");

			// result of translating text to english
			System.out.println(translatetoEnglish(morseInput)); 
		} else {
			System.out.println("Sorry, cannot translate.");
		}

	}

	/* Method used to translate English to Morse
	   input is the English string to be translated
           returns translated Morse text 
        */
	public static String translatetoMorse(final String english) {
		char ch;
		String stringResult = "Invalid English String cannot translate!!";
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < english.length(); i++) {
			ch = english.charAt(i);
			int index = getEnglishCharIndex(ch);
			if (index < 0) {
				return stringResult;
			}
			result.append(morseValues[index]);
		}
		stringResult = result.toString();

		return stringResult;

	} 

	/* Method used to translate Morse to English
	   input is the Morse string to be translated
           returns translated English text 
        */
	public static String translatetoEnglish(String morse) {
		char ch;
		String result = "Invalid Morse String cannot translate!!";
		StringBuffer morseChar = new StringBuffer();
		StringBuffer stringResult = new StringBuffer();
		for (int i = 0; i < morse.length(); i++) {
			ch = morse.charAt(i);
			if (ch == ' ') {
				morseChar.append(ch);
				int index = getMorseCharIndex(morseChar.toString());
				if (index < 0) {
					return result;
				}
				stringResult.append(englishValues[index]);
				morseChar.setLength(0);
			} else {
				morseChar.append(ch);
			}
		}
		result = stringResult.toString();
		return result;
	} 


	/* Method used to get index of a character from englishValues array
	   input is the English character
           returns index English character 
        */
	public static int getEnglishCharIndex(char x) {
		int index = -1;
		for (int i = 0; i < englishValues.length; i++) {
			if (x == englishValues[i]) {
				index = i;
				break;
			}
		}

		return index;
	} 

	/* Method used to get index of a character from morseValues array
	   input is the Morse character
           returns index Morse character 
        */
	public static int getMorseCharIndex(String y) {
		int index = -1;
		for (int i = 0; i < morseValues.length; i++) {
			if (y.equals(morseValues[i])) {
				index = i;
				break;
			}
		}

		return index;
	} 

}
