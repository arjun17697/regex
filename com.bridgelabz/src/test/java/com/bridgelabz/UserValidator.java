package com.bridgelabz;

import java.util.regex.Pattern;

public class UserValidator {
	public static final String firstName = "[A-Z]{1}[A-za-z]{2,}";
	public static final String lastName = "[A-Z]{1}[A-za-z]{2,}";
	public static final String emailID = "^[a-z0-9]{1,}([_+.-][a-z0-9]){0,}@[a-z]{1,}.[a-z]{1,}(.[a-z])*";
	public static final String mobileNo = "^[1-9][0-9]\\s[1-9][0-9]{9}";
	public static final String Password = ".{8,}";
	public static final String Password1 = "(?=.*[A-Z]).{8,}$";
	public static final String Password2 = "(?=.*[0-9])(?=.*[A-Z]).{8,}$";
	public static final String Password3 = "^(?=.*?[0-9a-zA-Z])[0-9a-zA-Z]*[@#$%][0-9a-zA-Z]*$";

	public boolean validateFirstName(String fName) {
		Pattern pattern = Pattern.compile(firstName);
		return pattern.matcher(fName).matches();
	}

	public boolean validateLastName(String lName) {
		Pattern pattern = Pattern.compile(lastName);
		return pattern.matcher(lName).matches();
	}

	public boolean validateEmail(String email) {
		Pattern pattern = Pattern.compile(emailID);
		return pattern.matcher(email).matches();
	}

	public boolean validatemobile(String mobile) {
		Pattern pattern = Pattern.compile(mobileNo);
		return pattern.matcher(mobile).matches();
	}

	public boolean validatepassword(String password) {
		Pattern pattern = Pattern.compile(Password);
		return pattern.matcher(password).matches();
	}

	public boolean validatepassword1(String password1) {
		Pattern pattern = Pattern.compile(Password1);
		return pattern.matcher(password1).matches();
	}

	public boolean validatepassword2(String password2) {
		Pattern pattern = Pattern.compile(Password2);
		return pattern.matcher(password2).matches();
	}

	public boolean validatepassword3(String password3) {
		Pattern pattern = Pattern.compile(Password3);
		return pattern.matcher(password3).matches();
	}

}
