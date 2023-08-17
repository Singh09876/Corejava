package com.rays.exception;

public class TestMistakeExceptionPropagation {
	public static void main(String[] args) throws MistakeException {
		dad();
		
	}

	private static void dad() throws MistakeException {
		mom();
		
	}

	private static void mom() throws MistakeException {
sun()		;
	}

	private static void sun() throws MistakeException {
MistakeException e=new MistakeException()	;
throw e;
	}

}
