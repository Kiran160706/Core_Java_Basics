package javabasics;

import java.util.Scanner;

public class UpperCaseEachLetter {
	
	public static void main(String[] args) {
		
		String s = "my name is Kiran"; 
		s=s+" ";
		String word="";
		
		for(int i=0; i<s.length(); i++) {
			char c=s.charAt(i);
			
			if(c != ' ') {
				word = word+c;
			}
			else {
				char sc = word.charAt(0);//extract first character
				char sc1 = Character.toUpperCase(sc);//convert it into upper case
				word=sc1+word.substring(1);//remaining string concat
				System.out.println(word);//print
				word="";//reset
			}
			
		}
		
		
	}

}
