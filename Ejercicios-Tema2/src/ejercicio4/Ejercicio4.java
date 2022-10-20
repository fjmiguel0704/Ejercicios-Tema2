package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		int num, unidadesNum, decenasNum = 0;
		String unidades, decenas, num0;
		

		Scanner read = new Scanner (System.in);
		
		System.out.println("Introduce un número entero que se encuentre '1-99': ");
		
		num = read.nextInt();
		
		decenasNum=num/10;
		unidadesNum=num%10;
		
		if (num<0||num>99) {
			System.out.println("El número introducido no está comprendido ente 1 y 99");
		}
		
	}

}
		
//		else {
//			switch (num){
//			case 1:
//				unidades="uno";
//			case 2:
//				unidades="dos";
//			case 3:
//				unidades="tres";
//			case 4:
//				unidades="cuatro";	
//			case 5:
//				unidades="cinco";
//			case 6:
//				unidades="seis";
//			case 7:
//				unidades="siete";
//			case 8:
//				unidades="ocho";;
//			case 9:
//				unidades="nueve";
//			}
//				if (unidadesNum==0) {
//					switch (num) {
//					case 20:
//						num0="veinte";
//					case 30:
//						num0="treinta";
//					case 40:
//						num0="cuarenta";
//					case 50:
//						num0="cincuenta";
//					case 60:
//						num0="sesenta";
//					case 70:
//						num0="setenta";
//					case 80:
//						num0="ochenta";
//					case 90:
//						num0="noventa";
//					}
//				}
//				else if (num>=21&&num<=29) {
//						decenas="veinti";
//							System.out.println(decenas+unidades);
//						
//			}
//			
//			
//				}
//			}
//			
//		}
			
	

		
	

	



//1,3,4,6

//case 10:
//	System.out.println("diez");
//case 11:
//	System.out.println("once");
//case 12:
//	System.out.println("doce");
//case 13:
//	System.out.println("trece");
//case 14:
//	System.out.println("catorce");
//case 15:
//	System.out.println("quince");