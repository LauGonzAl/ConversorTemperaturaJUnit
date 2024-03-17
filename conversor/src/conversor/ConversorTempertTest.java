package conversor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConversorTempertTest {

	@Test
	public void testCalcularFahrenheit() {
		
		ConversorTempert conversor = new ConversorTempert();
		
		assertEquals(35.6, conversor.calcularFahrenheit(2), 0.01);
		assertEquals(37.4, conversor.calcularFahrenheit(3), 0.01);
		assertEquals(39.2, conversor.calcularFahrenheit(4), 0.01);
	}


	@Test
	void testCalcularKelvin() {
		
		ConversorTempert conversor = new ConversorTempert();
		
		assertEquals(275, conversor.calcularFahrenheit(2), 0.01);
		assertEquals(276.15, conversor.calcularFahrenheit(3), 0.01);
		assertEquals(277.15, conversor.calcularFahrenheit(4), 0.01);	
	}

}
