package flow_control_2;

import java.util.Scanner;

public class WhileKelasD2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Masukkan nama lengkap Anda: ");
		
		while (sc.hasNext()) {
			System.out.println(sc.next());
		}
	}	
}
