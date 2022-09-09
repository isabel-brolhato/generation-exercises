/*For. Ler 10 números e imprimir quantos são pares e quantos são ímpares.
*/

package generation;

import java.util.Scanner;

public class ForExercicio2 {

	public static void main(String[] args) {
		int num, par=0,imp=0,x=0;
		Scanner read=new Scanner(System.in);
		

for(x=0;x<10;x++) {
	System.out.println("\nInsira um número: ");
	num=read.nextInt();
	if(num%2==0) {
		par++;
	}else if(num%2==1){
		imp++;
	}
}
System.out.println("\nO total de números pares foi de: "+par);
System.out.println("\nO total de números ímpares foi de: "+imp);
	}

}
