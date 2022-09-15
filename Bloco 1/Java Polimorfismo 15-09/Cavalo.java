package oop;

public class Cavalo extends Animal {

	public Cavalo(String nome, int idade) {
		super(nome, idade);

	}

	 public void som(String barulho) {
		 System.out.println("\n "+getNome()+" está relinchando: "+barulho);
	 }
	 
	public void acao(String acao) {
		System.out.println("\n "+getNome()+" está "+acao+" mais rápido que todos os cavalos!");
	}
}

