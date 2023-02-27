package musica;

public class Guitarra extends Instrumento{
	
	private int cuerdas;

	public Guitarra(String familia, String marca, float precio, int cuerdas) {
		
		super(familia, marca, precio);
		this.cuerdas = cuerdas;
	}

	//Metodo para tocar
	//Dejas claro a Java que estás sobreescribiendo
	@Override
	public String tocar() {
		
		return "wa wa";
	}
}
