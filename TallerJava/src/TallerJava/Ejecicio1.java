package TallerJava;

import java.util.Scanner;

public class Ejecicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double Ex1, Ex2, Qz1, Qz2, Tall1, Tall2, Pro;
		double Taller, Quiz, Proyec, Examen;
		double Prom;
		
		System.out.print("Digite la nota del primer examen: ");
		Ex1 = sc.nextDouble();
		System.out.print("Digite la nota del segundo examen: ");
		Ex2 = sc.nextDouble();
		System.out.print("Digite la nota del primer quiz: ");
		Qz1 = sc.nextDouble();
		System.out.print("Digite la nota del segundo quiz: ");
	    Qz2 = sc.nextDouble();
		System.out.print("Digite la nota del primer taller: ");
	    Tall1 = sc.nextDouble();
	    System.out.print("Digite la nota del segundo taller: ");
		Tall2 = sc.nextDouble();
		System.out.print("Digite la nota del proyecto: ");
		Pro = sc.nextDouble();
		
		Taller = (Tall1+Tall2)*0.2;
		Examen = (Ex1+Ex2)*0.4;
		Quiz = (Qz1+Qz2)*0.1;
		Proyec = Pro*0.3;
		System.out.println("\n");
		System.out.println("La nota en talleres es: "+Taller);
		System.out.println("La nota en examenes es: "+Examen);
		System.out.println("La nota en quizes es: "+Quiz);
		System.out.println("La nota en proyecto es: "+Proyec);
		
		Prom = (Taller+Examen+Quiz+Proyec);
		System.out.println("\n");
		System.out.print("El promedio final del alumno es: "+Prom);
		
	}

}
