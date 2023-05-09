package string;

public class StringTest {

	public static void main(String[] args) {
		
		String nama = "Institut Teknologi Sepuluh Nopember";
		
		// 1
		int panjang = nama.length();	
		System.out.println(panjang);
		
		// 2
		System.out.println(nama.length());
		
		System.out.println(nama.substring(9));
		System.out.println(nama.substring(9, 18));
		
		/*
		for (int i=0; i < nama.length(); i++) {
			System.out.println("Karakter ke-" + i + ": " + nama.charAt(i));
		}
		*/
		
		System.out.println(nama.toLowerCase());
		System.out.println(nama.toUpperCase());
		
		String tekno = nama.substring(8, 19);
		System.out.println(">>" + tekno + "<<");
		System.out.println(">>" + tekno.trim() + "<<");
		
		String it = nama.substring(0, 18);
		System.out.println(it);
		System.out.println(it + " India");
		System.out.println(it.concat(" India"));
		
		String sapaan1 = "Kakak";
		String sapaan2 = "kakak";
		String sapaan3 = "k4k4k";
		
		/*
		System.out.println(sapaan1.equals(sapaan2));
		System.out.println(sapaan1.equals(sapaan3));
		*/
		
		System.out.println(sapaan1.equalsIgnoreCase(sapaan2));
		System.out.println(sapaan1.equalsIgnoreCase(sapaan3));
		
		System.out.println(nama.replace('e', 'E'));
		System.out.println(nama.replace('e', 'o'));
		System.out.println(nama);
		
		System.out.println(nama.toLowerCase());
		System.out.println(nama.toLowerCase().replace("no", "yes"));
		
		System.out.println(nama.indexOf(' '));
		System.out.println(nama.indexOf("no"));
		
		System.out.println("ALEXANDER SATRYO PINANDHITO YUDHO PRATOMO".length());
		System.out.println("AATHIFAH DEWANTARI WIRYA MASSANGKA".length());
		
		
		
		

	}

}
