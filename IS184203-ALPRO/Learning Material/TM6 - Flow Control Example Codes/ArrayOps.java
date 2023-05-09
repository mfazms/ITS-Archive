package flow_control_3;

public class ArrayOps {

	public static void main(String[] args) {
		
		int[] nrp = {109, 86, 20, 17, 85, 211};
		int jumlah = 0;
		int max = 0;
		for (int i=0; i < nrp.length; i++) {
			jumlah += nrp[i];
			
		}
		System.out.println(jumlah);
		System.out.println(jumlah/nrp.length);
		
		for (int i=0; i < nrp.length; i++) {
			if(nrp[i]>max) {
				max = nrp[i];
			}
		}
		System.out.println("NRP terbesar adalah: " + max);
		
		
		int min = 1000;
		for (int i=0; i < nrp.length; i++) {
			if(nrp[i]<min) {
				min = nrp[i];
			}
		}
		System.out.println("NRP terkecil adalah: " + min);
		
		// 1. Cari rata-rata
		int sum     = 0;
		int average = 0;
		
		for (int i = 0 ; i < nrp.length;i++) {
			sum+=nrp[i];
		}
		average = sum/nrp.length;
		System.out.println("Rata-rata NRP adalah: " + average);
		
		// 2. Jumlahkan NRP yang di atas rata-rata
		int aboveAverage    = 0;
		int sumAboveAverage = 0;
		
		for (int i = 0; i < nrp.length;i++) {
			if(nrp[i] > average) {
				aboveAverage++;
				sumAboveAverage+=nrp[i];
			}
		}
		System.out.println("Ada " + aboveAverage + " mahasiswa yang NRP-nya lebih besar dari rata-rata NRP.");
		System.out.println("Jumlah NRP mereka adalah: " + sumAboveAverage);
	}
}
