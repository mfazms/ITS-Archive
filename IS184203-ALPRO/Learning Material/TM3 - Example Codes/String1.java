package string;

public class String1 {

	public static void main(String[] args) {
		
		String nama1 = "Institut Teknologi Sepuluh Nopember";
		String nama2 = "Universitas Airlangga";
		
		System.out.println(nama1.charAt(1));
		System.out.println(nama2.charAt(0));
		
		char hasil = "UIN Sunan Ampel".charAt(4);
		System.out.println(">>" + hasil + "<<");
		
		System.out.println();
		
		System.out.println(nama1.charAt(0));
		System.out.println(nama1.charAt(1));
		System.out.println(nama1.charAt(2));
		System.out.println(nama1.charAt(3));
		System.out.println(nama1.charAt(4));
		System.out.println(nama1.charAt(5));
		System.out.println(nama1.charAt(6));
		System.out.println(nama1.charAt(7));
		System.out.println(nama1.charAt(8));
		System.out.println(nama1.charAt(9));
		
		System.out.println(nama1.substring(0, 8));
		System.out.println(nama1.substring(9));
		
		System.out.println(nama1.toLowerCase());
		System.out.println(nama1.toUpperCase());
		
		String tek1 = nama1.substring(0, 8);
		String tek2 = nama1.substring(0, 9);
		
		System.out.println(">>" + tek1 + "<<");
		System.out.println(">>" + tek2 + "<<");
		
		System.out.println(">>" + tek1 + "<<");
		System.out.println(">>" + tek2.trim() + "<<");
		
		
	}
}
