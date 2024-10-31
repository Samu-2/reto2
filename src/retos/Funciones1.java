package retos;

import java.util.Scanner;

public class Funciones1 {
public static void menuLongitud() {
	Scanner sc = new Scanner(System.in);

	int opcion=0;
	do {
		System.out.println("Selecciona la conversion de longitud:");
		System.out.println("1.Millas a Kilómetros");
		System.out.println("2.Kiloóetros a millas");
		System.out.println("0.Salir");
	    opcion =FuncionesValidar.dimeEntero("Elige una opción", sc);
		
		switch(opcion) {
		case 1:
			System.out.println("Introduce Millas");
			String millas=sc.nextLine();
			int millas1=Integer.parseInt(millas);
		System.out.println(Funciones1.dimeKilometros(millas1));	
			
		case 2:
			System.out.println("Introduce kilometros");
			String kilometros=sc.nextLine();
			int kilometros1=Integer.parseInt(kilometros);
			System.out.println(Funciones1.dimeMillas(kilometros1));
		case 0:
			default:
		}
		
			
			
			
			
	}while(opcion!=0);

}
public static double dimeMillas(double kilometros) {
	 return kilometros/1.609;
}
public static double dimeKilometros(double millas) {
	return millas*1.609;
}
public static void menuPeso() {
	Scanner sc = new Scanner(System.in);

	int opcion=0;
	do {
		System.out.println("Selecciona la conversion de peso:");
		System.out.println("1.Libras a lilogramos");
		System.out.println("2.Kilogramos a libras");
		System.out.println("0.Salir");
		opcion =FuncionesValidar.dimeEntero("Elige una opción", sc);
		
	}while(opcion!=0);
	
}
public static double dimeKilogramos(double libras) {
	return libras/2.20462;
}
public static double dimeLibras(double kilogramos) {
	return kilogramos*2.20462;
}

}
