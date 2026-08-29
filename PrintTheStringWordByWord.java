package javabasics;

import java.util.Scanner;

public class PrintTheStringWordByWord {
	
	public static void main(String[] args) {
		// dynamic input
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to enter");
		String s = sc.nextLine();
		//String s = "My name is Kiran"; normal input
		s=s+" ";
		String word="";
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			
			if(c != ' ') {
				word = word+c;
			}
			else {
				System.out.println(word);
				word="";
			}
		}
	}

}
