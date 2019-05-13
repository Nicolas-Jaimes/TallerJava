package TallerJava;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int menor, mayor=0;
		int acc, apu, n=1;
		int[] v = new int[100];
		
		System.out.print("Digite el numero de acciones que se pueden apostar: ");
		acc = sc.nextInt();
		
		System.out.println("\n");
		for(int i=0;i<5;i++) {
			System.out.print("Digite el numero de acciones del jugador "+n+": " );
			apu = sc.nextInt();
			if(apu<=acc) {
				v[i]=apu*10000;
				n++;
			}
			else {
				System.out.println("Numero de acciones mayor al permitido");
				System.out.println("Digite un numero de acciones entre: 1-"+acc);
				System.out.print("Digite el numero de acciones del jugador "+n+": ");
				apu = sc.nextInt();
				v[i]=apu*10000;
				n++;
			}
		}
		System.out.println("\n");
		System.out.println("Asi estan las apuestas: ");
		for(int i=0;i<5;i++) {
			System.out.println(n+"->"+v[i]);
			n++;
		}
		
		System.out.println("\n");
		menor=v[0];
		for(int i=1;i<5;i++) {
			if(v[i]<menor) {
				menor=v[i];
			}
		}
		for(int i=0;i<5;i++) {
			if(v[i]>mayor) {
				mayor=v[i];
			}
		}
		System.out.println("La apuesta mayor es: "+mayor);
		System.out.println("La apuesta menor es: "+menor);

	}

}
