/*While.Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */

package generation;

import java.util.Scanner;

public class WhileExercicio3 {

	public static void main(String[] args) {
	int age,minor=0,older=0;
	Scanner read=new Scanner(System.in);

	System.out.println("\nInsira a idade: ");
	age=read.nextInt();
	while(age!=-99) {
		if(age<21) {
			minor++;
		}else if(age>50) {
			older++;
		}
		System.out.println("\nInsira a idade: ");
		age=read.nextInt();
	}
	System.out.println("\nO número de pessoas com menos de 21 anos é: "+minor);
	System.out.println("\nO número de pessoas com mais de 50 anos é: "+older);
	
	}

}
