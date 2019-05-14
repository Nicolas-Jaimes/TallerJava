package TallerJava;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		String nombre="";
		Scanner sc = new Scanner(System.in);
		
		int clave, n=100, n1=1000;
		
		System.out.print("Digite su nombre: "+nombre);
		nombre = sc.nextLine();
		System.out.print("Digite la clave: ");
		clave = sc.nextInt();
		System.out.println("\n");
		while(clave<n || clave>=n1) {
			System.out.println("Digite una clave de tres cifras");
			System.out.print("Digite su clave: ");
			clave = sc.nextInt();
		}
		System.out.println("\n");
		System.out.println("Sus datos son: ");
		System.out.println("Nombre: "+nombre);
		System.out.print("Clave: "+clave);

	}

}
