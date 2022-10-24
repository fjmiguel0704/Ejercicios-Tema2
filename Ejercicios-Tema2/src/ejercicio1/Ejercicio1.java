package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	//Pruebas:
	//-Introducir 5=capicúa.
	//-Introducir 55=capicúa.
	//Introducir 656=capicúa.
	//-Introducir 4114=capicúa.
	//-Introducir 25=no capicúa.
	//-Introducir 955=no capicúa.
	//-Introducir 1515=no capicúa.
	public static void main(String[] args) {
		//Creamos la variables tipo int. 
		int num, unidades, decenas, centenas, millares, numInvert = 0;
		int decInvert, cenInvert, millInvert;

		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que ingrese un número. Comprendido entre 0 y 9999
		System.out.println("Introduce un número comprendido en un rango del 0 al 9999: ");

		//Declaramos la variable num, que guardará el número introducido por el usuario
		num = read.nextInt();                                        

		//Declaramos la variable unidades. Esta guardará el resto de la división de la variable num entre 10
		unidades = num % 10;
		
		//Declaramos la variable decenas. Esta guardará el resto de la división de la variable num entre 100
        decenas = num % 100;
        
      //Declaramos la variable centenas. Esta guardará el resto de la división de la variable num entre 1000
        centenas = num % 1000;

        //Declaramos la variable decInvert. Guardará el resultado de dividir la variable decenas entre 10 y nos devolverá las decenas invertidas
        decInvert = decenas / 10;
        
        //Declaramos la variable cenInvert. Guardará el resultado de dividir la variable decenas entre 100 y nos devolverá las centenas invertidas
        cenInvert = centenas / 100;
        
        //Declaramos la variable millInvert. Guardará el resultado de dividir la variable decenas entre 1000 y nos devolverá los millares invertidos
        millInvert = num / 1000;

        //si num es menor que 0 y mayor a 99999, que muestre un error
        if (num < 0 || num > 99999) {
            System.out.print("ERROR: el número introducido no es correcto");
        } 

        //En caso contrario, si num es mayor o igual a 0 y menor o igual a 9, numInvert será igual a num
        else if (num >= 0 && num <= 9) { 
            numInvert = num;
        } 
        
        //En caso contrario, si numero es mayor a 9 y menor a 100, numero invertido será el resultado de multiplicar las unidades por 10 y sumarle las decenas invertidas
        else if (num > 9 && num < 100){ 
        	numInvert = (unidades * 10) + (decInvert);
        } 
        
      //En caso contrario, si numero es mayor a 99 y menor a 1000, numero invertido será el resultado de multiplicar las unidades por 100 y sumarle las decenas invertidas por 10 + las centenas invertidas
        else if (num > 99 && num < 1000){ 
        	numInvert = (unidades * 100) + (decInvert * 10) + (cenInvert);
        } 
        
      //En caso contrario, si numero es mayor a 999 y menor a 10000, numero invertido será el resultado de multiplicar las unidades por 10 y sumarle las decenas invertidas por 100 mas las centenas invertidas por 10 mas los millares invertidos
        else if (num > 999 && num < 10000){ 
        	numInvert = (unidades * 1000) + (decInvert * 100) + (cenInvert * 10) + (millInvert);
        }
        
        //Si lo anterior se cumple, el número es capicúa
        if (num == numInvert) {
                System.out.println("Es capicúa.");
        }
        
        //Si no, no lo es
        else {
                System.out.println("No es capicúa.");
        }
        
        //Cerramos el Scanner
        read.close();

		}
	}


