package javabasics;

public class ToPrintStringLineByLineUsingBuiltInFunction {
	public static void main(String[] args) {
		String s = "My name is Kiran";
		
		String[] words=s.split(" ");
		
		for(String word:words) {
			System.out.println(word);
		}
	}

}
