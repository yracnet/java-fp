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
public class CorreoFiltro implements Filtro<Cliente>{

	public enum Oper {
		EQ, NEQ, END, START, ALL;
	};

	private final Oper oper;
	private final String correo;

	public CorreoFiltro() {
		this(null, Oper.ALL);
	}

	public CorreoFiltro(String correo) {
		this(correo, Oper.EQ);
	}

	public CorreoFiltro(String correo, Oper oper) {
		this.oper = oper;
		this.correo = correo;
	}

	@Override
	public boolean incluir(Cliente cliente) {
		if(cliente == null || cliente.getCorreo() == null){
			return false;
		} else if(oper == Oper.ALL){
			return true;
		} else if(oper == Oper.EQ){
			return correo.equalsIgnoreCase(cliente.getCorreo());
		} else if(oper == Oper.NEQ){
			return !correo.equalsIgnoreCase(cliente.getCorreo());
		} else if(oper == Oper.END){
			return !correo.endsWith(cliente.getCorreo());
		} else if(oper == Oper.START){
			return !correo.startsWith(cliente.getCorreo());
		}
		return false;
	}
	
}
