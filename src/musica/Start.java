package musica;

public class Start {

	public static void main(String[] args) {

		Piano deCola = new Piano("Cuerda percutida", "Yamaha", 3000f, 84);
		Bateria bateria1 = new Bateria("Percusión", "Pearl", 900f, 2);
		Guitarra fender = new Guitarra("Cuerda", "Fender", 4500f, 6);
		
		System.out.println(deCola.tocar());
		System.out.println(bateria1.tocar());
		System.out.println(fender.tocar());
		
		
		//Creo un instrumento
		Instrumento instrumento;
		//Adquiere la salida de batería
		instrumento = bateria1;
		System.out.println(instrumento.tocar());
		
		//Vector de Instrumentos
		Instrumento[] instrumentos= new Instrumento[5];
		instrumentos[0] = new Piano("Cuerda percutida", "Yamaha", 3000f, 84);
		instrumentos[1] = new Bateria("Percusión", "Pearl", 900f, 2);
		instrumentos[2] = new Piano("Cuerda percutida", "Yamaha", 3000f, 84);
		instrumentos[3] = new Guitarra("Cuerda", "Fender", 4500f, 6);
		instrumentos[4] = new Piano("Cuerda percutida", "Yamaha", 3000f, 84);
		

		//For para imprimir que crea una variable de objetos y que recorre el vector
		for(Instrumento instru : instrumentos) {
			
			System.out.println(instru.tocar());
		}
	}

}
