package flow_control_2;

public class Array1DKelasD {

	public static void main(String[] args) {
		
		String sapaan = "Halo, selamat pagi!";
		
		int[] arrayOfIntegers = {1, 7, 8, 21, 90, 33};
		
		String[] arrayOfStrings = {"AATHIFAH", "DEWANTARI", "WIRYA", "MASSANGKA"};
		
		System.out.println(arrayOfIntegers[2]);
		System.out.println(arrayOfStrings[1]);
		
		System.out.println(arrayOfIntegers.length);
		System.out.println(arrayOfStrings.length);
		
		System.out.println();
		
		for (int i=0; i<arrayOfIntegers.length; i++) {
			
			System.out.print(" " + arrayOfIntegers[i]);
		}
		
		System.out.println();
		
		for (int i=arrayOfStrings.length-1; i>=0; i--) {
			
			System.out.print(" " + arrayOfStrings[i]);
		}


	}

}
