/* first test*/

package com.example.email_validator;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmailValidatorTest {

	//first test
	@Test
	public void testValidate() {
		EmailValidator emailVal = new EmailValidator("zachery@hotmailcom");
		boolean expectedOutput = false;
		boolean actualOutput = emailVal.validate();
		assertEquals(expectedOutput, actualOutput);
	}
	
	//second test
	@Test
	public void testValidate2(){
		EmailValidator emailVal = new EmailValidator("zachery@@hotmail.com");
		boolean expectedOutput = false;
		boolean actualOutput = emailVal.validate();
		assertEquals(expectedOutput, actualOutput);
	}
	
	//third test
	@Test
	public void testValidate3(){
		EmailValidator emailVal = new EmailValidator("zach^ery@hotmail.com");
		boolean expectedOutput = false;
		boolean actualOutput = emailVal.validate();
		assertEquals(expectedOutput, actualOutput);
	}
	
	//fourth test
		@Test
		public void testValidate4(){
			EmailValidator emailVal = new EmailValidator(".zachery@hotmail.com");
			boolean expectedOutput = false;
			boolean actualOutput = emailVal.validate();
			assertEquals(expectedOutput, actualOutput);
		}
	

}
