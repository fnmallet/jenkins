package paquete;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hola mundo!!!");
		
		System.out.println("Presioná Enter para cerrar...");
		Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        scanner.close();
	}

}
