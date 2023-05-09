package string;

public class String2 {

	public static void main(String[] args) {
		
		String nama = "Institut Teknologi Sepuluh Nopember";
		
		System.out.println(nama.indexOf('I'));
		System.out.println(nama.indexOf('T'));
		System.out.println(nama.indexOf('S'));
		System.out.println(nama.indexOf('N'));
		
		System.out.println(">>" + nama.substring(19, 26) + "<<");
		
		System.out.println(nama.indexOf(' '));
		System.out.println(nama.indexOf('t'));
		System.out.println(nama.indexOf('t', nama.indexOf('t')+1));
		
		String coba = "";
		
		coba = coba + 'C';
		coba = coba + 'O';
		coba += 'B';
		coba += 'A';
		
		System.out.println(coba);
		
		String result = "";
		
		result += nama.charAt(0);
		result += nama.charAt(nama.indexOf(' ')+1);
		result += nama.charAt(nama.indexOf(' ', nama.indexOf(' ')+1)+1);
		result += nama.charAt(nama.indexOf(' ', nama.indexOf(' ', nama.indexOf(' ')+1)+1)+1);
		
		System.out.println(result);
		
		String hasil = "";
		int posisiSpasi = 0;
		
		hasil += nama.charAt(0);
		posisiSpasi = nama.indexOf(' ');
		
		// System.out.println(posisiSpasi);
		
		hasil += nama.charAt(posisiSpasi+1);
		posisiSpasi = nama.indexOf(' ', posisiSpasi+1);
		
		// System.out.println(posisiSpasi);
		
		hasil += nama.charAt(posisiSpasi+1);
		posisiSpasi = nama.indexOf(' ', posisiSpasi+1);
		
		// System.out.println(posisiSpasi);
		
		hasil += nama.charAt(posisiSpasi+1);
		
		System.out.println(hasil);
		
		System.out.println(nama.substring(0, 18));
		System.out.println(nama.substring(0, 18).concat(" India"));
		System.out.println(nama.substring(0, 18) + " India");
		
		System.out.println(nama.replace('e', '3').replace('i', '1').replace('o', '0'));
		System.out.println(nama.toLowerCase().replace("no", "yes"));

				
				
		
		
	}

}
