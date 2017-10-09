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
import java.util.List;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class Run02Poo {

	public static void main(String arg[]) {
		Cliente a = new Cliente("Gonzalo", "gonzo@gmail.com", Genero.MASCULINO);
		Cliente b = new Cliente("Ruben", "ruben@hotmail.com", Genero.MASCULINO);
		Cliente c = new Cliente("Rolando", "rolando@gmail.com", Genero.MASCULINO);
		Cliente d = new Cliente("Ximena", "ximena@hotmail.com", Genero.FEMENINO);
		List<Cliente> clienteList = Arrays.asList(a, b, c, d);

		Filtro f1 = new GeneroFiltro(Genero.MASCULINO, GeneroFiltro.Oper.EQ);

		System.out.println("Masculino & all");
		List<Cliente> clienteListA = filtrarCliente(clienteList, f1);
		clienteListA.forEach(System.out::println);

		Filtro f2 = new GeneroFiltro(Genero.FEMENINO, GeneroFiltro.Oper.EQ);
		Filtro f3 = new CorreoFiltro("hotmail.com", CorreoFiltro.Oper.END);

		System.out.println("Femenino & gmail");
		List<Cliente> clienteListB = filtrarCliente(clienteList, f2, f3);
		clienteListB.forEach(System.out::println);

	}

	private static List<Cliente> filtrarCliente(List<Cliente> clienteList, Filtro... filtroList) {
		List<Cliente> resultList = new ArrayList<>();
		for (Cliente cliente : clienteList) {
			boolean incluir = true;
			for (Filtro filtro : filtroList) {
				incluir = incluir && filtro.incluir(cliente);
			}
			if (incluir) {
				resultList.add(cliente);
			}
		}
		return resultList;
	}

}
