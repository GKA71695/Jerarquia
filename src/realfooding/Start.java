package realfooding;

public class Start {

	public static void main(String[] args) {
		
		Comida[] realFood = new Comida[10];
		realFood[0] = new Carne("Entrecot", 480, true);
		realFood[2] = new Carne("Pechuga", 90, false);
		realFood[3] = new Carne("Lomo", 390, false);
		realFood[4] = new Fruta("Manzana", 60, 6, false);
		realFood[5] = new Fruta("Dátiles", 45, 26, true);
		realFood[6] = new Fruta("Pasas", 50, 9,true);
		realFood[7] = new Verdura("Berza", 30, false, true);
		realFood[8] = new Verdura("Coliflor", 55, false, false);
		realFood[9] = new Verdura("Cebolla", 22, true, false);
		
		for(Comida alimento : realFood) {
			
		System.out.println(alimento.procedencia());
		System.out.println(alimento.saludable());
		System.out.println("--------------------");
		}
	}

}
