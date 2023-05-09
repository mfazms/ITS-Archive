package flow_control_2;

public class ArrayKelasE {

	public static void main(String[] args) {
		
		int[] num = {17, 7, 19, 45};
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println();
		
		System.out.println(num.length);
		System.out.println();
		
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
		}
		System.out.println();
		
		for (int i=num.length-1; i>=0; i--) {
			System.out.println(num[i]);
		}
		System.out.println();
		
		String nama = "I GEDE MAHAWIYARTA PRIYADARSA BENDESA PUTRA";
		String[] komponenNama = nama.split(" ");
		String inisial = "";
		
		for (int i=0; i < komponenNama.length; i++) {
			inisial += komponenNama[i].charAt(0) + ".";
		}
		System.out.println(inisial);
	}
}
