/*Vetor, exercício 2
 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.
 * 
*/
programa
{
	funcao inicio()
	{
	inteiro dado[10], lanc, mdlanc=0,maior=0,ocmaior=0,x
para(x= 0; x < 10; x++){ 
	escreva("\nInsira o número: ") 			
	leia(dado[x]) 	
	mdlanc+=dado[x]
	se(maior < dado[x]){
		maior = dado[x]}
}
para(x= 0; x < 10; x++){ 
se(maior==dado[x])
{
		ocmaior++}
escreva("\nVetor posição: ",x, " : ", dado[x])
}
escreva("\nA média foi: ", mdlanc/10)
escreva("\nA maior pontuação foi: ",maior, ",que ocorreu ", ocmaior, " vez/vezes")

}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 477; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */