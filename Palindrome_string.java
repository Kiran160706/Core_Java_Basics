package javabasics;

import java.util.Scanner;

public class Palindrome_string {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String s = sc.next();
		String rev= "";
		
		for(int i=s.length()-1; i>=0; i--) {
			char c=s.charAt(i);
			rev=rev+c;
		}
			if(s.equals(rev)) {
				System.out.println("It is palindrome");
			}
			else {
				System.out.println("It is not palindrome");
			}
		}
	
}