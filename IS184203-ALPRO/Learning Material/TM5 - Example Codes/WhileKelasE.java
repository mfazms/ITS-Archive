package flow_control_2;

public class WhileKelasE {

	public static void main(String[] args) {
		
		boolean executeWhile = true;
		
		int jumlahIterasi = 0;
		
		while (executeWhile) {
			System.out.println("Halo!");
			
			jumlahIterasi++;
			System.out.println("Jumlah iterasi sekarang: " + jumlahIterasi);
			
			if (jumlahIterasi > 5) {
				executeWhile = false;
			}
		}
	}
}
