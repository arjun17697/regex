package com.bridgelabz;

import org.junit.Assert;

import org.junit.Test;

public class UC1fName {

	@Test
	public void givenFirstName_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Arjun");
		Assert.assertEquals(true, result);

	}

	@Test
	public void givenFirstName_WhenShort_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Ar");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenFirstName_WhenSpecial_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateFirstName("Ar!");
		Assert.assertEquals(false, result);

	}

	@Test
	public void givenLastName_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Gupta");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName_WhenShort_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Gu");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenLastName_WhenSpecial_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateLastName("Gu!");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmailID_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("arjun17697@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmailID_WhenATmissing_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("arjun17697gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmailID_WhenMandatoryPart1missing_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("@gmail.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenEmailID_WhenMandatoryPart2missing_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validateEmail("arjun17697@.com");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNo_WhenProper_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatemobile("91 8824347236");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenMobileNo_WhenCountryCodeMissing_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatemobile("8824347236");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNo_WhenSpaceMissing_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatemobile("918824347236");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenMobileNo_WhenDigitsMoreThan10_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatemobile("91 88243472361");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenDigitslessthan8_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword("1234567");
		Assert.assertEquals(false, result);
	}

	@Test
	public void givenPassword_WhenDigitsare8_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword("12345678");
		Assert.assertEquals(true, result);

	}

	public void givenPassword_WhenNoUpperCase_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword1("12345678");
		Assert.assertEquals(false, result);

	}

	public void givenPassword_WhenUpperCase_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword1("ArjunGupta");
		Assert.assertEquals(true, result);
	}

	public void givenPassword_WhenNumberPresent_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword2("ArjunGupta1");
		Assert.assertEquals(true, result);
	}

	public void givenPassword_WhenNumberNotPresent_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword2("ArjunGupta");
		Assert.assertEquals(false, result);

	}

	public void givenPassword_WhenSpecialCharNotPresent_ReturnFalse() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword3("ArjunGupta1");
		Assert.assertEquals(false, result);
	}

	public void givenPassword_WhenSpecialCharPresent_ReturnTrue() {
		UserValidator validator = new UserValidator();
		boolean result = validator.validatepassword3("ArjunGupta1.");
		Assert.assertEquals(true, result);
	}
}
