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
		opcion =FuncionesValidar.dimeEntero("Elige una opci�n", sc);
		
		switch(opcion) {
		case 1:
			Funciones1.menuLongitud();
		}
	
		
		}while(opcion!=0);

	}

}
