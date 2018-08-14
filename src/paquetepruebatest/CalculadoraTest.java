package paquetepruebatest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import paqueteprueba.Calculadora;

class CalculadoraTest {

	

	@Test
	public void testSumar() {
		Calculadora calculadoraDePrueba = new Calculadora();
		int resultadoEsperado = 4;
		int resultadoObtenido = calculadoraDePrueba.sumar(2, 2);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testRestar() {
		Calculadora calculadoraDePrueba = new Calculadora();
		int resultadoEsperado = 100;
		int resultadoObtenido = calculadoraDePrueba.restar(120, 20);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testMultiplicar() {
		Calculadora calculadoraDePrueba = new Calculadora();
		int resultadoEsperado = 200;
		int resultadoObtenido = calculadoraDePrueba.multiplicar(100, 2);
		assertEquals(resultadoEsperado, resultadoObtenido);
	}

	@Test
	public void testDividir() {
		Calculadora calculadoraDePrueba = new Calculadora();
		float resultadoEsperado = 100;
		float resultadoObtenido = calculadoraDePrueba.dividir(200, 2);
		assertEquals(resultadoEsperado, resultadoObtenido, 0);
	}
}
