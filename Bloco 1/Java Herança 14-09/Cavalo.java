package oop;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade, String som) {
		super(nome, idade, som);

	}

	public void correr() {
			  System.out.println(getNome()+" está correndo!");
}
}
