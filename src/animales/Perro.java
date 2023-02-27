package animales;

//Clase hijo que hereda caracteristicas de la clase superior
public class Perro extends Animales{
	
	private boolean lloro;
	private int vidas;
	
	public Perro(String nombre, int edad, int peso, boolean lloro, int vidas) {
	
		super(nombre, edad, peso);
		this.lloro = true;
		this.vidas = 7;
	}

	public void hablar() {

		System.out.println("Guau!!!  " + nombre);
	}
	
	

}
