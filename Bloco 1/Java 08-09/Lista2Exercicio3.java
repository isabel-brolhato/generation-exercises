/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
*/

package generation;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
int idade;
Scanner read=new Scanner(System.in);

System.out.println("\nEntre com a idade: ");
idade=read.nextInt();

if(idade<=14 && idade>=10) {
	System.out.println("\nCategoria infantil");
}else if(idade<=17 && idade>=15) {
	System.out.println("\nCategoria juvenil");
}else if(idade<=25 && idade>=18) {
	System.out.println("\nCategoria adulto");
}else {
	System.out.println("\nIdade inválida");
}
	}

}
