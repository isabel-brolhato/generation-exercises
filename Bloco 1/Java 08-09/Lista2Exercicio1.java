//Faça um programa que receba três inteiros e diga qual deles é o maior.

package generation;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int n1,n2,n3,maior;
		
		Scanner read=new Scanner(System.in);

		System.out.println("\nEntre com o primeiro número: ");
		n1=read.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		n2=read.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		n3=read.nextInt();
		
		if(n3>n2 && n3>n1) {
			System.out.println("\nO maior número foi: "+n3);
		}else if(n2>n3 && n2>n1) {
			System.out.println("\nO maior número foi: "+n2);
		}else if(n1>n2 && n1>n3) {
			System.out.println("\nO maior número foi: "+n1);
		}
		
	}

}
