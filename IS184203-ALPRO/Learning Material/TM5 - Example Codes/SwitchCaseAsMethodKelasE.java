package flow_control_2;

public class SwitchCaseAsMethodKelasE {

	public static void main(String[] args) {
		
		int angkatan = 2021;
		String namaAngkatan = "";
		
		/*
		if (angkatan==2022) {
			namaAngkatan = "(belum ada)";
			
		} else if (angkatan==2021) {
			namaAngkatan = "Vistanara";
			
		} else if (angkatan==2020) {
			namaAngkatan = "Adhisakta";
			
		} else if (angkatan==2019) {
			namaAngkatan = "Navisatya";
			
		} else {
			if (angkatan < 2001) {
				namaAngkatan = "(SI belum berdiri)";
			} else {
				namaAngkatan = "(tidak diketahui)";
			}
		}
		*/
		
		switch (angkatan) {
		
		case (2022):
			namaAngkatan = "(belum ada)";
			System.out.println(namaAngkatan);
			break;
		case 2021:
			namaAngkatan = "Vistanara";
			System.out.println(namaAngkatan);
			break;
		case 2020:
			namaAngkatan = "Adhisakta";
			System.out.println(namaAngkatan);
			break;
		case 2019:
			namaAngkatan = "Navisatya";
			System.out.println(namaAngkatan);
			break;
		default:
			if (angkatan < 2001) {
				namaAngkatan = "(SI belum berdiri)";
			} else {
				namaAngkatan = "(tidak diketahui)";
			}
			System.out.println(namaAngkatan);
		}
		
		System.out.println("Nama angkatan " + angkatan + ": " + namaAngkatan);
	}
}
