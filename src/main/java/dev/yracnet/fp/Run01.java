/*
 * JAVA Functional Programming (JAVA-FP)
 * htp://www.github.com/yracnet/java-fp
 */
package dev.yracnet.fp;

import dev.yracnet.fp.modelo.Cliente;
import dev.yracnet.fp.modelo.Cliente.Genero;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class Run01 {

	public static void main(String arg[]) {
		Cliente a = new Cliente("Gonzalo", "gonzo@gmail.com", Genero.MASCULINO);
		Cliente b = new Cliente("Ruben", "ruben@hotmail.com", Genero.MASCULINO);
		Cliente c = new Cliente("Rolando", "rolando@gmail.com", Genero.MASCULINO);
		Cliente d = new Cliente("Ximena", "ximena@hotmail.com", Genero.FEMENINO);
		List<Cliente> clienteList = Arrays.asList(a, b, c, d);
		System.out.println("==============");
		clienteList.forEach(
										cliente -> {
											printCliente(cliente);
										}
		);
	}

	public static void printCliente(Cliente cliente) {
		System.out.println("-----------------");
		System.out.println("Nombre: " + cliente.getNombre());
		System.out.println("Correo: " + cliente.getCorreo());
		System.out.println("Genero: " + cliente.getGenero());
	}

}
