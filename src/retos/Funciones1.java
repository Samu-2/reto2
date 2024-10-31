package retos;

public class Funciones1 {
public static void longitud() {
	do {
		System.out.println("Selecciona la conversion de longitud:");
		System.out.println("1.Millas a Kilómetros");
		System.out.println("2.Kiloóetros a millas");
		System.out.println("0.Salir");
	}while(true);
}
public static double dimeMillas(double kilometros) {
	 return kilometros/1.609;
}
public static double dimeKilometros(double millas) {
	return millas*1.609;
}
public static void peso() {
	do {
		System.out.println("Selecciona la conversion de peso:");
		System.out.println("1.Libras a lilogramos");
		System.out.println("2.Kilogramos a libras");
		System.out.println("0.Salir");
	}while(true);
	
}
public static double dimeKilogramos(double libras) {
	return libras/2.20462;
}
public static double dimeLibras(double kilogramos) {
	return kilogramos*2.20462;
}

}
