package retos;

public class Funciones2 {
	
	public static double gradosAFahrenheit(double grados) {
		
		return ((grados * 9 / 5) + 32);
	}
	
    public static double fahrenheitAGrados(double fahrenheit) {
		
    	return ((fahrenheit - 32) * 5 / 9);
	}
    
    public static double litrosAGalones(double litros) {
    	
    	return litros/3.785;
    }
    
    public static double galonesALitros(double galones) {
    	
    	return galones*3.785;
    }

}
