//Lista 1 exercício 4
/*
 * Escreva  um programa que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:  
 * D=R+S/2, onde R=(A+B)² e S=(B+C)²
 */

programa
{
	
	funcao inicio()
	{
inteiro A,B,C,D,R,S
escreva("Insira o valor de A:")
leia(A)
escreva("Insira o valor de B:")
leia(B)
escreva("Insira o valor de C:")
leia(C)
R=(A+B)*(A+B)
S=(B+C)*(B+C)
D=(R+S)/2
escreva("A expressão é igual a:",D)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 430; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */