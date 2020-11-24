package com.bridgelabz;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;



@RunWith(Parameterized.class)
public class JUnit_ParameterizedTestValidator {
	private String inputmail;
	private Boolean expectedResult;
	private JUnit_ParamaterizedTest junittest;
	
	@Before
	public void initialize() {
		junittest= new JUnit_ParamaterizedTest();
	}
	public JUnit_ParameterizedTestValidator(String inputmail,Boolean expectedResult )
	{ this.inputmail=inputmail;
	this.expectedResult=expectedResult;
	}
	
	@Parameterized.Parameters
	public static Collection emails() {
		return Arrays.asList(new Object[][] {
			{"abc@yahoo.com", true},
			{"abc-100@yahoo.com",true},
			{"abc,100@yahoo.com", true},
			{"abc111@yahoo.com",true},
			{"abc.100@bac.com.au", true},
			{"abc+100@gmail.com",true},
			{"abc", false},
			{".abc@com.my",false},
			{"abc123@gmail.a",false},
			{"abc@.abc.com",false},
			{"abc@gmail.com.aa.au",false}
		});
	}
	
	@Test
	public void testJunit_Paramaterized() {
		System.out.println("Parameterized Mail is:"+ inputmail);
		assertEquals(expectedResult,UserValidator.validateEmail(inputmail));
		
	}
	


}
