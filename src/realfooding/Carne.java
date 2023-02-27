package realfooding;

public class Carne extends Comida {
	
	private boolean carneRoja;

	public Carne(String nombre, int calorias, boolean carneRoja) {
		
		super(nombre, calorias);
		this.carneRoja = carneRoja;
	}

	@Override
	public String procedencia() {
		
		String origen = "Animal";
		
		return nombre + origen;
	}

	@Override
	public boolean saludable() {
		
		boolean saludable = false;
		
		if(!carneRoja && calorias<100) {
			saludable = true;
		}
		
		return saludable;
	}

	
	
}
