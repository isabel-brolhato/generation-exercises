package oop;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro doggo=new Cachorro("Bob", 5);
		Cavalo horse=new Cavalo("Estrela",11);
		Preguica sloth=new Preguica("Carla",3);
		
		doggo.som("auauau");
		doggo.acao("correndo");
		horse.som("eheheheh");
		horse.acao("galopando");
		sloth.som("zzzzzzzz");
		sloth.acao("subindo uma árvore");

	}

}
