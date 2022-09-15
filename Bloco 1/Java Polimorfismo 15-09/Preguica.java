package oop;

public class Preguica extends Animal {
	  public Preguica(String nome, int idade) {
		  super(nome,idade);
		  }
		  
		 public void som(String barulho) {
			 System.out.println("\n "+getNome()+" está vocalizando: "+barulho);
		 }
		 
		public void acao(String acao) {
			System.out.println("\n "+getNome()+" está "+acao+" com muita preguiça!");
		}
}
