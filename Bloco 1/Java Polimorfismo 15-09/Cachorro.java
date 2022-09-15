package oop;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	}
	
	 public void som(String barulho) {
		 System.out.println("\n "+getNome()+" está latindo: "+barulho);
	 }
	 
	public void acao(String acao) {
		System.out.println("\n "+getNome()+" está "+acao+" com seus amigos cachorros!");
	}

}
