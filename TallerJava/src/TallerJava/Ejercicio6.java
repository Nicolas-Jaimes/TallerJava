package TallerJava;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n;
		int z=0, x=1, y;
		
		System.out.print("Digite un numero: ");
		n=sc.nextInt();
		System.out.println("\n");
		System.out.println("La serie fibonacci del numero introducido es: ");
		for(int i=1;i<=n;i++) {
			y=z;
			z=y+x;
			x=y;
			System.out.print(x+" ");
		}

	}

}