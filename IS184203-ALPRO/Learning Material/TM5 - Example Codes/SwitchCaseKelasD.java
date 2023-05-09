package flow_control_2;

public class SwitchCaseKelasD {

	public static void main(String[] args) {
		
		int angkatan = 2000;
		String namaAngkatan = getNamaAngkatan(angkatan);
		
		System.out.println("Angkatan " + angkatan);
		System.out.println("Nama angkatan " + angkatan + ": " + namaAngkatan + ".");

	}
	
	public static String getNamaAngkatan(int angkatan) {
		
		switch (angkatan) {
		
		case 2022:
			return "belum ada";
		case 2021:
			return "Vistanara";
		case 2020:
			return "Adhisakta";
		case 2019:
			return "Navisatya";
		default:
			if (angkatan < 2001)
				return "SI belum berdiri";
			else
				return "tidak diketahui";
		}
	}
}
