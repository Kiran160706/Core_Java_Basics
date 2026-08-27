package javabasics;

public class CountDigits {
	public static void main(String[] args) {
		
		String email = "sawadekiran2006@gmail.com";
		
		int digitcount = 0;
		
		for(int i=0; i<email.length(); i++) {
			char c=email.charAt(i);
			if(Character.isDigit(c)) {
				digitcount++;
			}
		}
		System.out.println("Total Digits are: "+digitcount);
	}

}
