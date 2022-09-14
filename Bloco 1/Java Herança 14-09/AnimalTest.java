package oop;

public class AnimalTest {

	public static void main(String[] args) {
		Cachorro doggo=new Cachorro("Bob",5,"auauau");
		Cavalo horse=new Cavalo("Estrela",11,"ehhhhhh");
		Preguica sloth=new Preguica("Carla",3,"zzzzzzzz");
		
		System.out.println("Barulho dos animais: ");
		doggo.emitirSom();
		horse.emitirSom();
		sloth.emitirSom();
		
		System.out.println("\nAção dos animais: ");
		doggo.correr();
		horse.correr();
		sloth.subir();

	}

}
