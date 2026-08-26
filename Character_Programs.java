package javabasics;

import java.util.Scanner;

public class Character_Programs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any char");
		char ch = sc.next().charAt(0);
		char c = Character.toUpperCase(ch);
		
		if(c=='A' || c=='E' || c=='I' || c=='O' || c=='U') {
			System.out.println("Character is vowel");
		}
		else {
			System.out.println("Consonent");
		}
		
	}

}
