package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int numAleatorio1, numAleatorio2, suma, resultado;
		
		numAleatorio1= (int)(Math.random() * 99 +1);
		numAleatorio2= (int)(Math.random() * 99 +1);
		suma= numAleatorio1 + numAleatorio2;
		
		System.out.print(numAleatorio1 + " + " + numAleatorio2 + " = ");
		
		Scanner read = new Scanner (System.in);
		resultado = read.nextInt();
		
		if(resultado==suma) {
			System.out.println("¡BIEN! El resultado de la suma es correcto");
		}
		
		else {
			System.out.println("UPS... El resultado de la suma es erróneo");
		}
		
		read.close();
		
	}

}
