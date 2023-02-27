package realfooding;

public class Fruta extends Comida{
	
	private int azucar;
	private boolean deshidratada;

	public Fruta(String nombre, int calorias, int azucar, boolean deshidratada) {
		super(nombre, calorias);
		this.azucar = azucar;
		this.deshidratada = deshidratada;
	}

	@Override
	public String procedencia() {
		
		return nombre + "Vegano";
	}

	@Override
	public boolean saludable() {
		
		boolean devolver = true;
		
		if(azucar > 25) {
			devolver = false;
		}
		return false;
	}
	

}
