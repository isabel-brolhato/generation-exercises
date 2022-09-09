/*Do While. Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero).
*/

package generation;

import java.util.Scanner;

public class DoWhileExercicio6 {

	public static void main(String[] args) {
int num, media=0,total=0;
Scanner read=new Scanner(System.in);

System.out.println("\nInsira um número: ");
num=read.nextInt();

do {
	if(num%3==0) {
		media+=num;
				total++;
	}
	else if(num==0) {
		System.out.println("\nNúmero igual a 0");
	}
	System.out.println("\nInsira um número: ");
	num=read.nextInt();
	
}while(num!=0);
	System.out.println("A média dos múltiplos de 3 é: "+media/total);
	
	}

}
