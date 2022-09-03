/*Matriz, exercício 4
 * Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
diagonal, ou seja, diagonal principal.
 */
programa
{
	
	funcao inicio()
	{
	inteiro matriz[3][3], somaMatriz=0, somaDiagonal=0,x,y
	
	para (x=0;x<3;x++){
		para(y=0;y<3;y++){
			escreva("\nInsira um valor: ")
			leia(matriz[x][y])
			somaMatriz += matriz[x][y]
			
			se(x==y){
				somaDiagonal += matriz[x][y]
			}
		}
	}
escreva("\nSomatório da matriz: ",somaMatriz)
escreva("\nSomatório da diagonal principal: ",somaDiagonal)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 609; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */