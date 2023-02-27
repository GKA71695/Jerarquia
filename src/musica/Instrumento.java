package musica;

//Abstract cuando no vamos a crear objetos sueltos, de este tipo, directamente
public abstract class Instrumento {
	
	//Atributos
	protected String familia;
	protected String marca;
	protected float precio;
	
	//Constructor
	public Instrumento(String familia, String marca, float precio) {
		
		this.familia = familia;
		this.marca = marca;
		this.precio = precio;
	}
	
	/**
	 * Metodo para tocar sin parametros, que se sobreescribe de sus hijos
	 * Abstracto para saber que será sobreescrito
	 */
	public abstract String tocar();

}
