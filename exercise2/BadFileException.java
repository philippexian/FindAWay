package exercise2;

import java.io.*;

public class BadFileException extends Exception {

	private String exception;
		
	public BadFileException(String e){
		super(e);
		this.exception=e;
	}
	
	
}
