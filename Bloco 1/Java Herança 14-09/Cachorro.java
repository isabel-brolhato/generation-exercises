package oop;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade, String som) {
		super(nome, idade, som);

	}

	public void correr() {
		System.out.println(getNome() + " está correndo!");
	}

}
