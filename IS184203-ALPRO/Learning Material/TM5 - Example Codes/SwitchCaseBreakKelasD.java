package flow_control_2;

public class SwitchCaseBreakKelasD {

	public static void main(String[] args) {
		
		int angkatan = 2000;
		String namaAngkatan = "";
		
		switch (angkatan) {
		
		case 2022:
			namaAngkatan = "belum ada";
			break;
			
		case 2021:
			namaAngkatan = "Vistanara";
			break;
			
		case 2020:
			namaAngkatan = "Adhisakta";
			break;
			
		case 2019:
			namaAngkatan = "Navisatya";
			break;
			
		default:
			if (angkatan < 2001)
				namaAngkatan = "SI belum berdiri";
			else
				namaAngkatan = "tidak diketahui";
		}
		
		System.out.println("Angkatan " + angkatan);
		System.out.println("Nama angkatan " + angkatan + ": " + namaAngkatan + ".");	
	}
}
