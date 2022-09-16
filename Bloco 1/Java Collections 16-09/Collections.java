/*Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá trabalhar com Collection do tipo List 
 * do Java para manipular os dados desse estoque, o programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.

 * 
 */

package oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {
	public static void main(String[] args) {

		List<String> products = new ArrayList<String>();
		Scanner read = new Scanner(System.in);
		int op;

		do {
			System.out.println(
					"\nBem vindo ao sistema de estoque! O que deseja fazer? \n1-Adicionar um produto \n2-Remover um produto \n3-Atualizar um produto \n4-Mostrar os produtos existentes \n0-Sair");
			op = read.nextInt();

			switch (op) {
			case 1:
				System.out.println("\nQual produto deseja adicionar?");
				String produto = read.next();
				products.add(produto);
				break;
			case 2:
				System.out.println("\nQual produto deseja remover?");
				String produto1 = read.next();
				if (products.contains(produto1)) {
					products.remove(produto1);
				} else {
					System.out.println("\nEsse produto não existe...");
				}
				break;
			case 3:
				System.out.println("\nQual produto deseja atualizar?");
				String atualizado = read.next();
				System.out.println("\nQual produto irá substituir " + atualizado + "?");
				String novo = read.next();
				if (products.contains(atualizado)) {
					products.remove(atualizado);
					products.add(novo);
				} else {
					System.out.println("\nEsse produto não existe...");
				}
				break;
			case 4:
				System.out.println("\nProdutos em estoque: ");
				System.out.println(products);
				break;
			case 0:
				System.out.println("\nObrigado! Até mais!");
				break;
			default:
				System.out.println("\nDigite uma opção válida.");
			}

		} while (op != 0);

	}

}
