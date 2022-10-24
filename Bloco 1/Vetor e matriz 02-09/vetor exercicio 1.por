/*Vetor exercício 1
 * Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
 */

programa
{
	
	funcao inicio()
	{
	inteiro valores[5], maior=0,x
para(x= 0; x < 5; x++){ 
	escreva("\nInsira o número: ") 			
	leia(valores[x]) 	
	se(maior < valores[x]){
		maior = valores[x]}
escreva("\nOs valores foram de: ", valores[0], ",", valores[1], ",", valores[2])
escreva("\nO maior valor foi de: ",maior)
}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 277; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */