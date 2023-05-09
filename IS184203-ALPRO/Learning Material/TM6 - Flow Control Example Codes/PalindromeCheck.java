package flow_control_3;

public class PalindromeCheck {

	public static void main(String[] args) {

		String text = "Never odd or even";
		// String text = "'Hari Jumat one on one ya Guysss'";
		
		if (isPalindrome(text)) {
			System.out.println(text + " is a palindrome.");
		} else {
			System.out.println(text + " is not a palindrome.");
		}
	}
	
	public static boolean isPalindrome(String text) {
		// 0. Buat text yang sudah di-lower case dan dihilangkan spasinya
		text = text.toLowerCase().replace(" ","");
		System.out.println(text);
		
		// 1. Balik text
		String inverse = "";
		for (int i = text.length()- 1; i>=0 ; i--) {
			inverse += text.charAt(i);
		}
		System.out.println(inverse);
		
		// 2. Cek apakah hasilnya sama dengan text pada step 0
		return inverse.equals(text);
	}
}
