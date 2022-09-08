/*Lista 1, exercicio 1
 * Faça um programa que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
 * inteiro a,m,d,f
escreva("Insira os anos:")
leia(a)
escreva("Insira os meses:")
leia(m)
escreva("Insira os dias:")
leia(d)
f=a*365+m*30+d
escreva("Você tem", f, "dias")
 * 
 */

package generation;
import java.util.Scanner;


public class Lista1ex1 {

	public static void main(String[] args) {
		int days,months,years,age;
		Scanner read=new Scanner(System.in);
		
		System.out.println("\nEntre com os dias: ");
		days=read.nextInt();
		System.out.println("\nEntre com os meses: ");
		months=read.nextInt();
		System.out.println("\nEntre com os anos: ");
		years=read.nextInt();
		age=years*365+months*30+days;
		System.out.println("\nSua idade em dias é: "+age);

	}

}
