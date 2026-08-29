package javabasics;

import java.util.Scanner;

public class Character_Program_4 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Are you sure you want to delete");
		System.out.println("y/n");
		char input= sc.next().charAt(0);
		char c = Character.toLowerCase(input);
		
		if(c=='y') {
			System.out.println("Data deleted");
			}
		else if (c=='n'){
			System.out.println("Not deleted");
		}
		else {
			System.out.println("invalid input");
		}
		}
}
