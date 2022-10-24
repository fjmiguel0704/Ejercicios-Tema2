package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
	//Pruebas: 
	//-Introducimos 8.
	//-Introducimos 20.
	//-Introducimoa 14.
	//-Introducimos 16.
	//-Introducimos 74.
	public static void main(String[] args) {
		
		//Creamos las variables. num recogerá el númerpo introducido por el usuario y decenas y unidades el primer y segundo número de él
		int num, unidades, decenas;
		
		//Creamos otras dos variables tipo string. Guardarán el primer ny segundo número en formato texto
		String primeraLetra="", segundaLetra="";
		
		//Creamos el Scanner para leer por el teclado todo lo introducido por el usuario
		Scanner read = new Scanner (System.in);
		
		//Le pedimos al usuario que introduzca un número entre el 1 y el 99
		System.out.println("Introduce un número entero que se encuentre '1-99': ");
		
		//Declaramos la variable num, que recogerá el número introducido por el usuario
		num = read.nextInt();
		
		//Declaramos la variable unidades. Esta guardará el resto de la división de la variable num entre 10
		unidades=num%10;
		
		//Declaramo la variable decenas, que guardará el resultado de la división de la variable num entre 10
		decenas=num/10;
		
		//Indicamos, que si el número ntroducido es mayor o igual a 0 o mayor a 99 muestre un error
		if (num<=0||num>99) {
			System.out.println("El número introducido no está comprendido ente 1 y 99");
		}
		
		//Las unidades
        switch (unidades) {
        
        //En caso de ser 0
        case 0:
        	
        	//La primera letra recogerá "cero"
            segundaLetra = "cero";
            
            //Frenamos la cadena
            break;
            
            //Así sucesivamente hasta nueve
        case 1:
        	segundaLetra = "uno";
            break;
        case 2:
        	segundaLetra = "dos";
            break;
        case 3:
        	segundaLetra = "tres";
            break;
        case 4:
        	segundaLetra = "cuatro";
            break;
        case 5:
        	segundaLetra = "cinco";
            break;
        case 6:
        	segundaLetra = "seis";
            break;
        case 7:
        	segundaLetra = "siete";
            break;
        case 8:
        	segundaLetra = "ocho";
            break;
        case 9:
        	segundaLetra = "nueve";
            break;
    }
        
        //Las decenas
        switch (decenas) {
        
        //En caso de ser 2
		case 2: 
			
			//La primerá letra recogerá "veinte"
			primeraLetra="veinte";
			
			//Frenamos la cadena
			break;
			
			//Así hasta 90
		case 3: 
			primeraLetra="treinta";
			break;
		case 4: 
			primeraLetra="cuarenta";
			break;
		case 5: 
			primeraLetra="cincuenta";
			break;
		case 6: 
			primeraLetra="sesenta";
			break;
		case 7: 
			primeraLetra="setenta";
			break;
		case 8: 
			primeraLetra="ochenta";
			break;
		case 9: 
			primeraLetra="noventa";
			break;
        }
        
        
        //Si numero es mayor o igual a 1 y menor o igual a 9 que muestre únicamente la segunda letra del número
        if(num>=1&&num<=9) {
        	System.out.println(segundaLetra);
        }
        
        //En caso contrario, si num es mayor o igual a 10 y menor o igual a 15
        else if(num>=10&&num<=15){
        	
        	//Las unidades
        	switch (unidades) {
        	
        	//En caso de ser 0
			case 0: 
				
				//La segunda letra del número recogerá diez
				segundaLetra="diez";
				
				//Frenamos la cadena
				break;
				
				//Así hasta 15
			case 1: 
				segundaLetra="once";
				break;
			case 2: 
				segundaLetra="doce";
				break;
			case 3: 
				segundaLetra="trece";
				break;
			case 4: 
				segundaLetra="catorce";
				break;
			case 5: 
				segundaLetra="quince";
				break;
			}
        	
        	//Y mostramos la segunda letra del número
        	System.out.println(segundaLetra);
        }
        
        //En caso contrario, si num es mayor o igual a 16 y menor o igual a 19
        else if(num>=16&&num<=19) {
        	
        	//La primera letra será dieci y se mostrará la primera letra mas la segunda
        	primeraLetra="dieci";
        	System.out.println(primeraLetra+segundaLetra);
        }
        
      //En caso contrario, si unidades es igual a 0 y decenas distinto 0, muestra la primera letra solamente
        else if(unidades==0&&decenas!=0) {
        	System.out.println(primeraLetra);
        }
        
        //En caso contrario, si numero es mayor o igual a 21 y menor o igual a 29, la primera letra recogerá "veinti", y a ella sumale la segunda
        else if(num>=21&&num<=29) {
        	primeraLetra="veinti";
        	System.out.println(primeraLetra+segundaLetra);
        }
        
        //En caso contrario, si numero es mayor o igual a 21 y menor o igual a 99, a la primera letra sumale la segunda
        else if(num>=31&&num<=99) {
        	System.out.println(primeraLetra+ " y "+segundaLetra);
        }
        
        //Cerramos el Scanner
        read.close();
		
		
	}

}

