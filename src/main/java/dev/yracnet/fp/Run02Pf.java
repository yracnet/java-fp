/*
 * JAVA Functional Programming (JAVA-FP)
 * htp://www.github.com/yracnet/java-fp
 */
package dev.yracnet.fp;

import dev.yracnet.fp.filtro.CorreoFiltro;
import dev.yracnet.fp.filtro.Filtro;
import dev.yracnet.fp.filtro.GeneroFiltro;
import dev.yracnet.fp.modelo.Cliente;
import dev.yracnet.fp.modelo.Cliente.Genero;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class Run02Pf {

	public static void main(String arg[]) {
		Cliente a = new Cliente("Gonzalo", "gonzo@gmail.com", Genero.MASCULINO);
		Cliente b = new Cliente("Ruben", "ruben@hotmail.com", Genero.MASCULINO);
		Cliente c = new Cliente("Rolando", "rolando@gmail.com", Genero.MASCULINO);
		Cliente d = new Cliente("Ximena", "ximena@hotmail.com", Genero.FEMENINO);
		List<Cliente> clienteList = Arrays.asList(a, b, c, d);

		System.out.println("Masculino & Nombre contiene la letra 'o'");
		List<Cliente> clienteListA = clienteList.parallelStream()
										.filter(x -> x.getGenero() == Genero.MASCULINO)
										.filter(x -> x.getNombre().contains("o"))
										.collect(Collectors.toList());
		clienteListA.forEach(System.out::println);

		System.out.println("Femenino & hotmail");
		List<Cliente> clienteListB = clienteList.parallelStream()
										.filter(x -> x.getGenero() == Genero.FEMENINO)
										.filter(x -> x.getCorreo().endsWith("hotmail.com"))
										.collect(Collectors.toList());
		clienteListB.forEach(System.out::println);

	}

}
