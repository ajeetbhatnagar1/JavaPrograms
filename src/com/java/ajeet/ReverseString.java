package com.java.ajeet;

/**
 * Program to reverse a string using recursive algorithm
 * @author ajeet.a.bhatnagar
 *
 */
public class ReverseString {

	private String reverseStr = "";
	
	public String reverseString(String str) {
		
		if(str.length() == 1) {
			return str;
		} else {
			reverseStr = reverseStr + str.charAt(str.length() -1) + reverseString(str.substring(0,str.length()-1));
		}
		System.out.println(reverseStr);
		return reverseStr;
	}

	/**
	 * Main method to invoke the ReverseString class function.
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		reverseString.reverseString("Ajeet");
	}
}
