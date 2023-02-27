package animales;

//Clase hijo que hereda caracteristicas de la clase superior
public class Gato extends Animales{
	
	private int vecinosAuyentados;
	private boolean ronroneo;
	
	public Gato(String nombre, int edad, int peso, int vecinosAuyentados, boolean ronroneo) {
		
		super(nombre, edad, peso);
		vecinosAuyentados = 0;
		this.ronroneo = true;
	}

	public void hablar() {

		System.out.println("Miau!!!  " + nombre);
	}

}
