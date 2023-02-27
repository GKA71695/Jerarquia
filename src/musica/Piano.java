package musica;

public class Piano extends Instrumento{

	//Atributo unico
	private int teclas;
	
	//Constructor
	public Piano(String familia, String marca, float precio, int teclas) {
		
		super(familia, marca, precio);
		this.teclas = teclas;
	}

	//Metodo para tocar
	//Dejas claro a Java que estás sobreescribiendo
	@Override
	public String tocar() {
		
		return "plin plin";
	}
}
