package retos;

import java.util.Scanner;

public class Funciones1 {
	public static void menuLongitud() {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("Selecciona la conversion de longitud:");
			System.out.println("1.Millas a Kil�metros");
			System.out.println("2.Kilo�etros a millas");
			System.out.println("0.Salir");
			opcion = FuncionesValidar.dimeEntero("Elige una opci�n", sc);

			switch (opcion) {
			case 1:
				double millas = FuncionesValidar.dimeDouble("Introduce Millas", sc);
				System.out.println(Funciones1.dimeKilometros(millas));

			case 2:
				double Kilometros = FuncionesValidar.dimeDouble("Introduce kilometros", sc);
				System.out.println(Funciones1.dimeMillas(Kilometros));
			case 0:
			default:
			}

		} while (opcion != 0);

	}

	public static double dimeMillas(double kilometros) {
		return kilometros / 1.609;
	}

	public static double dimeKilometros(double millas) {
		return millas * 1.609;
	}

	public static void menuPeso() {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		do {
			System.out.println("Selecciona la conversion de peso:");
			System.out.println("1.Libras a lilogramos");
			System.out.println("2.Kilogramos a libras");
			System.out.println("0.Salir");
			opcion = FuncionesValidar.dimeEntero("Elige una opci�n", sc);
			switch (opcion) {
			case 1:
				double libras = FuncionesValidar.dimeDouble("Introduce libras", sc);
				System.out.println(Funciones1.dimeKilogramos(libras));
			case 2:
				double kilogramos = FuncionesValidar.dimeDouble("Introduce kilogramos", sc);
				System.out.println(Funciones1.dimeLibras(kilogramos));
			case 0:
			default:
			}

		} while (opcion != 0);

	}

	public static double dimeKilogramos(double libras) {
		return libras / 2.20462;
	}

	public static double dimeLibras(double kilogramos) {
		return kilogramos * 2.20462;
	}

}
