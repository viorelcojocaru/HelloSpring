package com.tutorialspoint;

public class HelloWorld {

	private String message;
	private String message1, message2, message3;

	// public void HelloWorld(String message) {
	// this.message=message;
	// }
	// public void printMessage(){
	// System.out.println(message);
	// }

	public String getMessage1() {
		return message1;
	}

	public void setMessage1(String message1) {
		this.message1 = message1;
	}

	public String getMessage2() {
		return message2;
	}

	public void setMessage2(String message2) {
		this.message2 = message2;
	}

	public String getMessage3() {
		return message3;
	}

	public void setMessage3(String message3) {
		this.message3 = message3;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void init() {
		System.out.println("init method ");
	}

	public void destroy() {
		System.out.println("destroy method");
	}

}
