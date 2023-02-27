package animales;

public class Start {

	public static void main(String[] args) {
		
		Perro billy = new Perro("Billy", 3, 5, false, 0);
		Perro sam = new Perro("Sam", 4, 28, false, 0);
		billy.hablar();
		sam.hablar();
		
		Gato misi = new Gato("Misilainas", 2, 3, 0, false);
		Gato garfield = new Gato("Garfield", 9, 3, 0, false);
		misi.hablar();
		garfield.hablar();
		
	}

}
