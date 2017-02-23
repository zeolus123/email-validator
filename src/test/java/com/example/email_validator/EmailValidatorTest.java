/* first test*/

package com.example.email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidatorTest {

	//first test
	@Test
	public void testValdiate() {
		EmailValidator emailVal = new EmailValidator("zachery@hotmailcom");
		boolean expectedOutput = false;
		boolean actualOutput = emailVal.validate();
		assertEquals(expectedOutput, actualOutput);
	}
	
	//second test
	@Test
	public void testValdate(){
		EmailValidator emailVal = new EmailValidator("zachery@@hotmail.com");
		boolean expectedOutput = false;
		boolean actualOutput = emailVal.validate();
		assertEquals(expectedOutput, actualOutput);
	}
	

}
