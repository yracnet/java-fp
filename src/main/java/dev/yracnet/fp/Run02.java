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
public class Run02 {

	public static void main(String arg[]) {
		Cliente a = new Cliente("Gonzalo", "gonzo@gmail.com", Genero.MASCULINO);
		Cliente b = new Cliente("Ruben", "ruben@hotmail.com", Genero.MASCULINO);
		Cliente c = new Cliente("Rolando", "rolando@gmail.com", Genero.MASCULINO);
		Cliente d = new Cliente("Ximena", "ximena@hotmail.com", Genero.FEMENINO);
		List<Cliente> clienteList = Arrays.asList(a, b, c, d);
		System.out.println("Masculino & all");
		List<Cliente> clienteListA = filtrarCliente(clienteList, Genero.MASCULINO, null);
		clienteListA.forEach(System.out::println);
		System.out.println("Femenino & gmail");
		List<Cliente> clienteListB = filtrarCliente(clienteList, Genero.FEMENINO, "hotmail.com");
		clienteListB.forEach(System.out::println);

	}

	private static List<Cliente> filtrarCliente(List<Cliente> clienteList, Genero genero, String correo) {
		List<Cliente> resultList = new ArrayList<>();
		for (Cliente cliente : clienteList) {
			if (cliente.getGenero() == genero) {
				if (cliente.getCorreo().endsWith(correo) || correo == null) {
					resultList.add(cliente);
				}
			}
		}
		return resultList;
	}

}
