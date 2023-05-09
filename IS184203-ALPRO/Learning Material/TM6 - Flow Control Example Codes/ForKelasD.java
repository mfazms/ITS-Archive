package flow_control_3;

public class ForKelasD {

	public static void main(String[] args) {
		
		int iteration = 0;
		int maxIteration = 3;
		
		/*
		for (System.out.println("A"); iteration < maxIteration; System.out.println("end of iteration")) {
			System.out.println("inside the for loop");
			iteration++;
		}
		*/
		
		/*
		for (int i=0; i < 3; i++) {
			for (int j=0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		for(int i=5; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			} 
			System.out.println();
		}
	}
}
