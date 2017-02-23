package com.example.email_validator;

/**
 * Validates emails
 * 
 */

public class EmailValidator {

	//only variable needed
	private String email;
	
	
	//constructor
	public EmailValidator(String email){
		this.email = email;
	}
	
	//getters and setters
	public void setEmail(String email){
		this.email = email;
	}
	
	public String getEmail(){
		return this.email;
	}
	
	//validate method
	public boolean validate(){
		boolean valid = false;
		if(checkOneAt() == true && email.contains(".")){
			valid = true;
		}
		return valid;
	}
	
	//helper method that checks there is only one @ character
	public boolean checkOneAt(){
		boolean valid = false;
		for(int i = 0; i < this.email.length(); i ++){
			if(this.email.charAt(i) == '@' && valid == true){
				valid = false;
				break;
			}
			if(this.email.charAt(i) == '@'){
				valid = true;
			}
		}
		return valid;
	}
}
