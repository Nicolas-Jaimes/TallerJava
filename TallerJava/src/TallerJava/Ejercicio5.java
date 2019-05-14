package TallerJava;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int fact, n;
		
		System.out.print("Digite un numero:" );
		n = sc.nextInt();
		System.out.println("\n");
		System.out.print(n+"!"+"=");
		fact=n;
		System.out.print(n);
		for(int i=n-1;i>0;i--) {
			fact*=i;
			System.out.print("x"+i);
		}
		System.out.print("="+fact);
		System.out.println("\n");
		System.out.println("El factorial del numero es: "+fact);
		

	}

}
