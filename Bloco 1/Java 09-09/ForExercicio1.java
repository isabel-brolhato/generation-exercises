/*FOR. Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
*/

package generation;

public class ForExercicio1 {

	public static void main(String[] args) {
		float x;
		
		for(x=1000;x<=1999;x++) {
			if(x%11==5) {
				System.out.println(x);
			}
		}

	}

}

