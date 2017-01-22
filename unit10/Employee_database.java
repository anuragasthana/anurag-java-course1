public class Employee_database {

	public static void main(String[] args) {

		int count = 1;
		count = Integer.parseInt(args[0]);
		while (count<1){
		count = Input.getInt("Please enter the number of employees which is greater than 0");
		}
		System.out.println("Employee Count: " + count + "\n");

		System.out.println("Employee Database" + "\n");
        Employee empDatabase[] = new Employee[count];
		for (int i = 0; i < count; i++) {
			Name name;
			name = new Name();
			name.setFirstName(Input
					.getString("What is the employee’s first name?"));
			name.setLastName(Input
					.getString("What is the employee's last name?"));
			System.out.println("Name: " + name.toString());

			Address address;
			address = new Address();
			address.setStreet(Input
					.getString("State the employee's house number and street."));
			address.setCity(Input
					.getString("What city does the employee live in?"));
			String state = Input
					.getString("What state does the employee live in? (2 letter form)");
			while (state.length() != 2) {
				state = Input.getString("Please try again.");
			}
			address.setState(state);
			int zip = Input.getInt("What is the employee's 5 digit zip code?");
			while (zip > 99999 || zip < 10000) {
				zip = Input.getInt("Please try again.");
			}
			address.setZip(zip);
			System.out.println("Address: " + address.toString());

			Date hireDate;
			hireDate = new Date();
			int year = Input.getInt("Which year was the employee hired?");
			while (year < 1950 || year > 2015) {
				year = Input.getInt("Please try again");
			}
			hireDate.setYear(year);
			int month = Input
					.getInt("Which month was the employee hired?(Please present in number form. Example: 1 = January, 2 = February, etc)");
			while (month < 1 || month > 12) {
				month = Input.getInt("Please try again.");
			}
			hireDate.setMonth(month);
			int day = Input.getInt("Which day was the employee hired?");
			while (day < 1 || day > 31) {
				day = Input.getInt("Please try again.");
			}
			hireDate.setDay(day);
			System.out.println("Hire Date: " + hireDate.toString());

			Employee e;
			e = new Employee();
			e.seteNum(Input.getInt("Enter the employee number."));
			System.out.println("Employee Number: " + e.geteNum());
			e.setName(name);
			e.setAddress(address);
			e.setHireDate(hireDate);
	
			empDatabase[i] = e;
			System.out.println();
			System.out.println();
			
			
		}

		 
	}

}
