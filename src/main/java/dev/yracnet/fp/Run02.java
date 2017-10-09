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
		
		List<Cliente> clienteMasculinoList = filtrarGenero(clienteList, Genero.MASCULINO);
		clienteMasculinoList.forEach(System.out::println);
		
		List<Cliente> clienteFemeninoList = filtrarGenero(clienteList, Genero.FEMENINO);
		clienteFemeninoList.forEach(System.out::println);
	
	}

	private static List<Cliente> filtrarGenero(List<Cliente> clienteList, Genero genero) {
		List<Cliente> resultList = new ArrayList<>();
		for (Cliente cliente : clienteList) {
			if (cliente.getGenero() == genero) {
				resultList.add(cliente);
			}
		}
		return resultList;
	}

}
