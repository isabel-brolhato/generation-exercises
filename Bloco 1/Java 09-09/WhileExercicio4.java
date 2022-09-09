/*Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;*
 o número de mulheres nervosas;*
 o número de homens agressivos;*
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;*
 o número de pessoas calmas com menos de 18 anos.*
*/

package generation;

import java.util.Scanner;

public class WhileExercicio4 {

	public static void main(String[] args) {
		int idade,sexo,caract,pessoas=0,c=0,mn=0,ha=0,oc=0,nm=0,cm=0;
		Scanner read=new Scanner(System.in);

		while(pessoas<3) {
			System.out.println("\nInsira sua idade: ");
			idade=read.nextInt();
			System.out.println("\nInsira seu sexo: 1-feminino,2-masculino,3-outros");
			sexo=read.nextInt();
			System.out.println("\nInsira sua característica: 1-calmo,2-nervoso,3-agressivo");
			caract=read.nextInt();
			if(idade>40 && caract==2) {
				nm++;
			}if (idade<18 && caract==1) {
				cm++;
			}if(caract==1) {
				c++;
			}if(sexo==1 && caract==2) {
				mn++;
			}if(sexo==2 && caract==3) {
				ha++;
			}if(sexo==3 && caract==1) {
				oc++;
			}
pessoas++;
		}
		System.out.println("\nO número de pessoas calmas é: "+c);
		System.out.println("\nO número de mulheres nervosas é: "+mn);
		System.out.println("\nO número de homens agressivos é: "+ha);
		System.out.println("\nO número de outros calmos é: "+oc);
		System.out.println("\nO número de pessoas nervosas com mais de 40 anos é: "+nm);
		System.out.println("\nO número de pessoas calmas com menos de 18 anos é: "+cm);
	
	}

}
