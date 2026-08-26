package methods;

public class Character_Methods {
	public static void main(String[] args) {

		// comparing two characters

		Character c1 = 'W';
		Character c2 = 'D';

		System.out.println(c1.compareTo(c2));

		// converting a character whether in upper case or lower case

		System.out.println(Character.toLowerCase('A'));
		System.out.println(Character.toUpperCase('d'));

		// checking whether the given character is in upper case or lower case

		System.out.println(Character.isUpperCase('z'));
		System.out.println(Character.isLowerCase('z'));

		// checking whether two characters are equal or not

		Character c3 = 'a';
		Character c4 = 'a';
		System.out.println(c3.equals(c4));

		// checking whether the given character contains whitespace

		Character c5 = ' ';
		System.out.println(Character.isWhitespace(c5));

		// checking whether a character is a digit or not

		System.out.println(Character.isDigit('1'));

		// checking whether a character is a letter or not

		System.out.println(Character.isLetter('A'));

		// checking whether a character is letter or digit

		System.out.println(Character.isLetterOrDigit('1'));

	}
}
