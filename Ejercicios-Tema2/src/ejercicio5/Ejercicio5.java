package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
	/**Las pruebas que deberíamos hacer al terminar el programa serían:
	*-Introducir un número positivo y otro negativo. 
	*Con la finalidad de que el número positivo me lo devuelva tal cual, 
	*y el número negativo en positivo*/
	
	public static void main(String[] args) {
		
		//Creamos la variable num. Guardará un número
		int num;

		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número
		System.out.println("Introduce un número: ");
		
		//Declaramos la variable num. Esta recogerá el dato introducido por el usuario
		num = read.nextInt();
		
		//Le mostramos al usuario el valor absoluto del número que ha introducido
		System.out.println(num > 0 ? num : -num);

	}

}
