/*
 * JAVA Functional Programming (JAVA-FP)
 * htp://www.github.com/yracnet/java-fp
 */
package dev.yracnet.fp;

import dev.yracnet.fp.modelo.Cliente;
import dev.yracnet.fp.modelo.Cliente.Genero;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class Run00 {

	public static void main(String arg[]) {
		//y = ( x² + 1 ) / (x² - 2)
		double x1 = 10.0;
		double a = cuadrado(x1) + 1;
		double b = cuadrado(x1) - 2;
		double y1 = divide(a, b);
		System.out.println("y=" + y1);
//		
//		
//		double x2 = 10.0;
//		Predicate<Double> gx = x-> Run00::cuadrado(x);
//		
//		double y2 = x->{};
//		double a = cuadrado(x1) + 1;
//		double b = cuadrado(x1) - 2;
//		double y1 = divide(a, b);
//		System.out.println("y=" + y1);

	}

	public static double cuadrado(double a) {
		return a * a;
	}

	public static double divide(double a, double b) {
		return a / b;
	}

	public static double suma(double a, double b) {
		return a + b;
	}

	public static void printCliente(Cliente cliente) {
		System.out.println("-----------------");
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Correo: " + cliente.getCorreo());
		System.out.println("Genero: " + cliente.getGenero());
	}

}
