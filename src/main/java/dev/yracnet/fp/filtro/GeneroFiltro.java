/*
 * JAVA Functional Programming (JAVA-FP)
 * htp://www.github.com/yracnet/java-fp
 */
package dev.yracnet.fp.filtro;

import dev.yracnet.fp.modelo.Cliente;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class GeneroFiltro implements Filtro<Cliente> {

	public enum Oper {
		EQ, NEQ, ALL;
	};

	private final Oper oper;
	private final Cliente.Genero genero;

	public GeneroFiltro() {
		this(null, Oper.ALL);
	}

	public GeneroFiltro(Cliente.Genero genero) {
		this(genero, Oper.EQ);
	}

	public GeneroFiltro(Cliente.Genero genero, Oper oper) {
		this.oper = oper;
		this.genero = genero;
	}

	@Override
	public boolean incluir(Cliente cliente) {
		if(cliente == null){
			return false;
		} else if(oper == Oper.ALL){
			return true;
		} else if(oper == Oper.EQ){
			return cliente.getGenero() == genero;
		} else if(oper == Oper.NEQ){
			return cliente.getGenero() != genero;
		}
		return false;
	}

}
