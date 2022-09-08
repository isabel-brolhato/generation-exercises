/*//Lista 1 exercício 4.
 * Escreva  um programa que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:  
 * D=R+S/2, onde R=(A+B)² e S=(B+C)²
 */


package generation;
import java.util.Scanner;


public class Lista1ex4 {

	public static void main(String[] args) {
	int A,B,C,D,R,S;
	Scanner read=new Scanner(System.in);
	
	System.out.println("\nEntre com o valor de A: ");
	A=read.nextInt();
	System.out.println("\nEntre com o valor de B: ");
	B=read.nextInt();
	System.out.println("\nEntre com o valor de C: ");
	C=read.nextInt();
	R=(A+B)*(A+B);
	S=(B+C)*(B+C);
	D=(R+S)/2;
	System.out.println("\nO valor de D é: "+D);
	
	}

}
