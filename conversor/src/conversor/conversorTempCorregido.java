package conversor;

public class conversorTempCorregido {
	

	    // Método que convierte grados Celsius a grados Fahrenheit.
	    public static double celsiusAFahrenheit(double celsius) {
	        return (celsius * 9) / 5 + 32; // Aquí corregí el cálculo de Fahrenheit, realmente equivale a 32ºF en vez de 37.2.
	    }

	    // Método que convierte grados Celsius a Kelvin.
	    public static double celsiusAKelvin(double celsius) {
	        return celsius + 273.15; // Aquí también he corregido el cálculo de Kelvin, es 273.15, en vez de 272.47.
	    }
	    
	    
	   // Además añado la clase "main" para comprobar por pantalla que se muestran correctamente los resultados.
	    public static void main(String[] args) {
	    	
	    	double gradosFahrenheit2 = celsiusAFahrenheit(2);
	    	System.out.println("2 grados Celsius equivalen a " + gradosFahrenheit2 + " grados Fahrenheit");
	    	
	    	double gradosKelvin2 = celsiusAKelvin(2);
	    	System.out.println("2 grados Celsius equivalen a " + gradosKelvin2 + " grados Kelvin");
	    	
	    	double gradosFahrenheit3 = celsiusAFahrenheit(3);
	    	System.out.println("3 grados Celsius equivalen a " + gradosFahrenheit3 + " grados Fahrenheit");
	    	
	    	double gradosKelvin3 = celsiusAKelvin(3);
	    	System.out.println("3 grados Celsius equivalen a " + gradosKelvin3 + " grados Kelvin");
	    	
	    	double gradosFahrenheit4 = celsiusAFahrenheit(4);
	    	System.out.println("4 grados Celsius equivalen a " + gradosFahrenheit4 + " grados Fahrenheit");
	    	
	    	double gradosKelvin4 = celsiusAKelvin(4);
	    	System.out.println("4 grados Celsius equivalen a " + gradosKelvin4 + " grados Kelvin");
	    	
	    }
	}

