/*
 * JAVA Functional Programming (JAVA-FP)
 * htp://www.github.com/yracnet/java-fp
 */
package dev.yracnet.fp;

import dev.yracnet.fp.modelo.Cliente;
import dev.yracnet.fp.modelo.Cliente.Genero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class Run03 {

	public static void main(String arg[]) {
		Cliente a = new Cliente("Gonzalo", "gonzo@gmail.com", Genero.MASCULINO);
		Cliente b = new Cliente("Ruben", "ruben@hotmail.com", Genero.MASCULINO);
		Cliente c = new Cliente("Rolando", "rolando@gmail.com", Genero.MASCULINO);
		Cliente d = new Cliente("Ximena", "ximena@hotmail.com", Genero.FEMENINO);
		List<Cliente> clienteList = Arrays.asList(a, b, c, d);
		
		System.out.println("Listado de correos");
		List<String> clienteListA = filtrarCliente(clienteList, Genero.MASCULINO, null);
		clienteListA.forEach(System.out::println);

	}

	private static List<String> filtrarCliente(List<Cliente> clienteList, Genero genero, String correo) {
		List<String> resultList = new ArrayList<>();
		for (Cliente cliente : clienteList) {
			if (cliente.getGenero() == genero) {
				if (correo == null || cliente.getCorreo().endsWith(correo)) {
					resultList.add(cliente.getCorreo());
				}
			}
		}
		return resultList;
	}

}
