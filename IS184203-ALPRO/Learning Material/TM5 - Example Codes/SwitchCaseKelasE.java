package flow_control_2;

import java.util.Scanner;

public class SwitchCaseKelasE {

	public static void main(String[] args) {
		
		// int angkatan = 2021;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan angkatan yang ingin diketahui: ");
		int angkatan = sc.nextInt();
		sc.close();
				
		String namaAngkatan = getNamaAngkatan(angkatan);
		
		System.out.println("Nama angkatan " + angkatan + ": " + namaAngkatan);
	}
	
	public static String getNamaAngkatan(int angkatan) {
		
		switch (angkatan) {
		
		case (2022):
			return "(belum ada)";
		case 2021:
			return "Vistanara";
		case 2020:
			return "Adhisakta";
		case 2019:
			return "Navisatya";
		default:
			if (angkatan < 2001) {
				return "(SI belum berdiri)";
			} else {
				return "(tidak diketahui)";
			}
		}
	}
}
