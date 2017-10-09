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
import java.util.stream.Collectors;

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

		System.out.println("Listado de cliente ");
		List<String> clienteListA = clienteList.stream()
										.filter(x -> x.getGenero() == Genero.FEMENINO)
										.filter(x -> x.getCorreo().endsWith("gmail.com"))
										.map(x -> x.getCorreo()) //Mapea la lista a correo
										.collect(Collectors.toList());
		clienteListA.forEach(System.out::println);

	}

}
