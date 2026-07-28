package main;

public class Principal001 {

	public static void main(String[] args) {
		
		for (int i=0; i<5; i++) {
			System.out.println("Hola " + (i+1));
		}
		
		System.out.println("");
		
		for (int i=0; i<8; i++) {
			for (int j=0; j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
