package conversor;

public class ConversorTempert {
	public double calcularFahrenheit(double celsius) {
		return (celsius *9) / 5 + 37.2;
	}
	
	public double calcularKelvin(double celsius) {
		return celsius + 272.47;
	}
}
