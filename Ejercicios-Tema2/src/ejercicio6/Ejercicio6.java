package ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
	/**Las pruebas que deberíamos hacer al terminar el programa serían las siguientes:
	*-Introducir la cantidad del resultado de la suma correcta. Y comprobar que me devuelve un mensaje de que la respuesta está bien. 
	*-Introducir una cantidad incorrecta. Y comprobar que me devuelve un mensaje de que la respuesta está mal.*/
	
	public static void main(String[] args) {
		
		//Creo las variables. Dos de ellas guardarán los números aleatorios, otra la suma de esos dos números y otra el resultado que crea el usuario.
		int numAleatorio1, numAleatorio2, suma, resultado;
		
		//Declaramos las variables de números aleatorios. A estas se les asignarán un número aleatorio comprendido entre el 1 y el 99
		numAleatorio1= (int)(Math.random() * 99 +1);
		numAleatorio2= (int)(Math.random() * 99 +1);
		
		//Declaramos la variable suma. Guardará el resultado de la suma de los dos números aleatorios
		suma= numAleatorio1 + numAleatorio2;
		
		//Mostramos los números a sumar
		System.out.print(numAleatorio1 + " + " + numAleatorio2 + " = ");
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Declaramos la variable resultado. Guardará el valor introducido por el usuario.
		resultado = read.nextInt();
		
		//Si ese valor introducido por el usuario es igual al resultado de la suma de los dos números aleatorios, está bien.
		if(resultado==suma) {
			System.out.println("¡BIEN! El resultado de la suma es correcto");
		}
		
		//En caso contrario, de no ser igual, está mal.
		else {
			System.out.println("UPS... El resultado de la suma es erróneo");
		}
		
		//Cerramos el Scanner
		read.close();
		
	}

}
