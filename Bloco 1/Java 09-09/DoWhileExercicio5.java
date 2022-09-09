/*Do While.Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
*/

package generation;

import java.util.Scanner;

public class DoWhileExercicio5 {

	public static void main(String[] args) {
int num, sum=0;
 Scanner read=new Scanner(System.in);
 
 System.out.println("\nInsira um número: ");
 num=read.nextInt();
do {
	if(num!=0) {
		sum+=num;
	}else {
		System.out.println("\nNúmero igual a 0. Insira outro número.");
	}
	System.out.println("\nInsira um número: ");
	 num=read.nextInt();
}
 while(num!=0);
System.out.println("\nA some dos números inseridos é: "+sum);
	}

}
