package TallerJava;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		String nombre="";
		Scanner sc = new Scanner(System.in);
		int unidad, decena, centena;
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
		System.out.println("Clave: "+clave);
		
		centena = clave/100;
		decena = (clave%100)/10;
		unidad = (clave%100)%10;
		
		if(unidad==centena || (unidad==decena && unidad==centena)) {
			System.out.println("La clave "+clave+" es un numero capicua");
		}
		else {
			System.out.println("La clave "+clave+" no es un numero capicua");
		}

	}

}
