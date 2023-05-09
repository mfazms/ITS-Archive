package string;

public class CreatingMethod {

	public static void main(String[] args) {
		
		double a = 3;
		double b = 5;
		
		System.out.println(jumlah(a, b));
		
		System.out.println(findInitial("Muhammad Haikal Akhtar Nugroho"));
		System.out.println(findInitial("MOEHAMMAD FAZLE MAWLA SIDIKI"));
		System.out.println(findInitial("AATHIFAH DEWANTARI WIRYA MASSANGKA"));
		System.out.println(findInitial("I KOMANG DELON JANARWIGUNA"));	
	}
	
	public static double jumlah(double operand1, double operand2) {
		return operand1 + operand2;
	}
	
	public static String findInitial(String nama) {
		
		String inisial = "";
		
		inisial = inisial + nama.charAt(0);
		
		int posisiSpasi = nama.indexOf(' ');
		inisial += nama.charAt(posisiSpasi + 1);
		
		posisiSpasi = nama.indexOf(' ', posisiSpasi + 1);
		inisial += nama.charAt(posisiSpasi + 1);
		
		posisiSpasi = nama.indexOf(' ', posisiSpasi + 1);
		inisial += nama.charAt(posisiSpasi + 1);
		
		return inisial;
	}
}
