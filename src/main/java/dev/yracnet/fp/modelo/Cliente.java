/*
 * JAVA Functional Programming (JAVA-FP)
 * htp://www.github.com/yracnet/java-fp
 */
package dev.yracnet.fp.modelo;

/**
 *
 * @author Willyams Yujra <yracnet@gmail.com>
 */
public class Cliente {

	public enum Genero {
		MASCULINO, FEMENINO
	}
	private String nombre;
	private String correo;
	private Genero genero;

	public Cliente() {
	}

	public Cliente(String nombre, String correo, Genero genero) {
		this.nombre = nombre;
		this.correo = correo;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "Cliente{" + "nombre=" + nombre + ", correo=" + correo + ", genero=" + genero + '}';
	}

}
