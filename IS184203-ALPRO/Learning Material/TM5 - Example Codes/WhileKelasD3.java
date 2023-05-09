package flow_control_2;

public class WhileKelasD3 {

	public static void main(String[] args) {
		
		int i = 1;
		int sumOfSquare = 0;
		
		while (i <= 10) {
			System.out.println("Nilai i sekarang: " + i);
			sumOfSquare += Math.pow(i, 2);
			i+=3;
		}
		
		System.out.println(sumOfSquare);
	}
}
