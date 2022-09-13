/*
 * Crie uma classe paciente e apresente os atributos e métodos referentes esta classe, em seguida crie um objeto paciente, defina as instancias deste objeto e apresente as informações deste objeto no console.
 * 
 */

package ood;

public class Paciente {
private String nome;
private int idade;
private String espécie;
private String raça;

public Paciente(String nome, int idade, String espécie, String raça) {
	this.nome=nome;
	this.idade=idade;
	this.espécie=espécie;
	this.raça=raça;
		
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getIdade() {
	return idade;
}

public void setIdade(int idade) {
	this.idade = idade;
}

public String getEspécie() {
	return espécie;
}

public void setEspécie(String espécie) {
	this.espécie = espécie;
}

public String getRaça() {
	return raça;
}

public void setRaça(String raça) {
	this.raça = raça;
}

public void printInfo() {
	System.out.println("Paciente: "+nome+", Idade: "+idade+", Espécie: "+espécie+", Raça: "+raça);
}
public void bark() {
	System.out.println(nome+" está dizendo: auauauauau ");
}

}
