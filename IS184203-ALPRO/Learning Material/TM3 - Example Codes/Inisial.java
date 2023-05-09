package string;

public class Inisial {

	public static void main(String[] args) {
		
		String nama = "Arjuna Ahmad Dewangga Aljabbar";
		
		String inisial = "";
		
		inisial = inisial + nama.charAt(0);
		
		int posisiSpasi = nama.indexOf(' ');
		System.out.println(posisiSpasi);
		inisial += nama.charAt(posisiSpasi + 1);
		
		posisiSpasi = nama.indexOf(' ', posisiSpasi + 1);
		System.out.println(posisiSpasi);
		inisial += nama.charAt(posisiSpasi + 1);
		
		posisiSpasi = nama.indexOf(' ', posisiSpasi + 1);
		System.out.println(posisiSpasi);
		inisial += nama.charAt(posisiSpasi + 1);
		
		System.out.println(inisial);
			
	}

}
