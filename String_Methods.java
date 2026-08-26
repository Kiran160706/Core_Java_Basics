package methods;

public class String_Methods {

	public static void main(String[] args) {

		// finding string with the help of its position

		String s1 = "kiran";
		System.out.println(s1.charAt(0));
		System.out.println(s1.indexOf('a'));

		// finding last index of a string

		String s2 = "java";
		System.out.println(s2.lastIndexOf('a'));

		// finding the length of a string

		String s3 = "kiran";
		System.out.println("Total length of " + s3 + " is " + s3.length());

		// finding whether two strings are equal or not (case sensitive)

		String s4 = "java";
		String s5 = "Java";

		System.out.println(s4.equals(s5));

		// finding whether two string are equal or not (not case sensitive)

		System.out.println(s4.equalsIgnoreCase(s5));

		// finding substring from a string

		String s6 = "javadeveloper";
		System.out.println(s6.substring(4));
		System.out.println(s6.substring(4, 7));

		// converting a whole string into uppercase

		String s7 = "java";
		System.out.println(s7.toUpperCase());

		// converting a whole string into lowercase

		String s8 = "PYTHON";
		System.out.println(s8.toLowerCase());

		// string length including spaces

		String s9 = " k i r a n ";
		System.out.println(s9.length());

		// printing an empty string

		String s10 = "";
		System.out.println(s10.length());

		// trimming a string

		String s11 = "   kiran   ";
		System.out.println(s11.trim());

		// Concatenating two strings

		String s12 = "mobile";
		String s13 = " charger";
		System.out.println(s12.concat(s13));

		// checking whether the string starts with the character we want

		String s14 = "Mumbai";
		System.out.println(s14.startsWith("M"));

		// checking whether the string ends withe the character we want

		System.out.println(s14.endsWith("i"));

		// checking whether the string contains the character in it

		System.out.println(s14.contains("mb"));

		// replacing an alphabet from the string

		System.out.println(s14.replace('a', '*'));

		// comparing two strings

		String a = "naman";
		String b = "aman";
		System.out.println(a.compareTo(b));

	}

}
