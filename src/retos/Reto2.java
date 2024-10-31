package retos;

import java.util.Scanner;

public class Reto2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int opcion=0;
		do {
		System.out.println("Selecciona el tipo de conversion");
		System.out.println("1.Longitud");
		System.out.println("2.Peso");
		System.out.println("3.Temperatura");
		System.out.println("4.Volumen");
		System.out.println("0.Salir");
		opcion =FuncionesValidar.dimeEntero("Elige una opción", sc);
		
		switch(opcion) {
		case 1:
			Funciones1.menuLongitud();
		case 2:
			Funciones1.menuPeso();
		case 3:
			Funciones2.menuTemperatura();
			
		case 4:
			Funciones2.menuVolumen();
		}
	
		
		}while(opcion!=0);

	}

}
