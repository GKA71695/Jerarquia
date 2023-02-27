package realfooding;

public class Verdura extends Comida{
	
	private boolean tuberculo;
	private boolean hojaVerde;

	public Verdura(String nombre, int calorias, boolean tuberculo, boolean hojaVerde) {
		super(nombre, calorias);
		this.tuberculo = tuberculo;
		this.hojaVerde = hojaVerde;
	}

	@Override
	public String procedencia() {
		
		return nombre + "Vegano";
	}

	@Override
	public boolean saludable() {

		return true;
	}
	
	

}
