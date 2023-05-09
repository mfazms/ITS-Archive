package flow_control_3;

public class ForExample {

	public static void main(String[] args) {
		
		int i = 2;
		
		for (System.out.println("Mari kita mulai!"); i < 7; System.out.println("Ini adalah akhir dari loop.")) {
			System.out.println("Nilai i sekarang: " + i);
			i += 2;
		}
	}
}
