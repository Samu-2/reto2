package retos;

import java.util.Scanner;

public class Funciones2 {
	
	public static void menuTemperatura() //submenu
	{
		Scanner sc= new Scanner(System.in); //PA LEER TODO
		int opcion=0; //opcion que elige 
		do {
			System.out.println("Selecciona la conversion de longitud:");
			System.out.println("1.De grados a fahrenheit");
			System.out.println("2.De fahrenheit a grados");
			System.out.println("0.Salir");
			
		switch(opcion) {
		case 1: 
		double grados=FuncionesValidar.dimeDouble("Introduce grados", sc);
			System.out.println(Funciones2.gradosAFahrenheit(grados));
			
		case 2: 
			double fahrenheit=FuncionesValidar.dimeDouble("Introduce fahrenheit", sc);
				System.out.println(Funciones2.fahrenheitAGrados(fahrenheit));
				
		case 0:
	
			default:
		}
			
		
		}while(opcion!=0);
		
	}
	public static double gradosAFahrenheit(double grados) { //funcion
		
		return ((grados * 9 / 5) + 32);
	}
	
    public static double fahrenheitAGrados(double fahrenheit) { //funcion
		
    	return ((fahrenheit - 32) * 5 / 9);
	}
    
    public static void menuVolumen() //submenu
	{
    	Scanner sc= new Scanner(System.in);
    	int opcion=0;
		do {
			System.out.println("Selecciona la conversion de longitud:");
			System.out.println("1.De litros a galones");
			System.out.println("2.De galones a litros");
			System.out.println("0.Salir");
			
			switch(opcion) {
			case 1: 
			double litros=FuncionesValidar.dimeDouble("Introduce litros", sc);
				System.out.println(Funciones2.litrosAGalones(litros));
				
			case 2: 
				double galones=FuncionesValidar.dimeDouble("Introduce galones", sc);
					System.out.println(Funciones2.galonesALitros(galones));
					
			case 0:
		
				default:
			}

		}while(opcion!=0); //cuando sea 0 se acaba
		
	}
    public static double litrosAGalones(double litros) { //funcion
    	
    	return litros/3.785;
    }
    
    public static double galonesALitros(double galones) { //funcion
    	
    	return galones*3.785;
    }
    
    

}
