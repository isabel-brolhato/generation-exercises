/*Exercicio 3.
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 */


package generation;

import java.util.Scanner;

public class ArrayExercicio3 {

	public static void main(String[] args) {
		Scanner read=new Scanner(System.in);
		int[][] matriz=new int[3][3];
int maior=0,linha=0,coluna=0;

for(linha=0;linha<3;linha++) {
	for(coluna=0;coluna<3;coluna++) {
		System.out.println("\nEntre com um número na linha: "+linha+" e coluna: "+coluna+" : ");
		matriz[linha][coluna] = read.nextInt();

		if(matriz[linha][coluna]>10){
	maior++;
		
}

	}

}
System.out.println("\nA matriz possui "+maior+" valores maiores que 10.");

	}
}