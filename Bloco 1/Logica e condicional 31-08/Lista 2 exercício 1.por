//Lista 2 - Exercício 1

programa
{
	funcao inicio()
	{
		real p,E,M
escreva ("Insira o valor do peso:")
leia (p)

se (p<=50){
	E=0.0
	M=0.0
}senao {
	E=p-50
	M=E*4 
	}
		escreva("O valor do excesso é:", E, ". O valor da multa é:", M)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 239; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */