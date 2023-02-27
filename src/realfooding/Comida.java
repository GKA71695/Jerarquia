package realfooding;

public abstract class Comida {
	
	//Atributos
	protected String nombre;
	protected int calorias;
	
	//Constructor
	public Comida(String nombre, int calorias) {
		this.nombre = nombre;
		this.calorias = calorias;
	}
	
	//Métodos abstractos que cogeran de otras clases
	public abstract String procedencia();
	public abstract boolean saludable();

}
