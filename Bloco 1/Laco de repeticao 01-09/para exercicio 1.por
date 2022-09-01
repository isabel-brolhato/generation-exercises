//Para, exercicio 1

programa
{
	
	funcao inicio()
	{
		real sal,sumsal=0.0,mdsal,mdf,maiorsal=0.0,porc=0.0
		inteiro numf,sumf=0,maior=0,x

		para(x=1; x<=20; x++)
		{
			escreva("Insira o valor do salário: ")
			leia(sal)
			escreva("Insira o número de filhos: ")
			leia(numf)
			sumsal += sal
			sumf += numf

			se (maior < sal){
				maior = sal
			}
			se (sal <=100){
				porc++
			}
			}
			mdsal = sumsal / 20
			mdf = sumf / 20
			porc = (maior*100) / 20
			escreva("\nO salário médio é: ", mdsal)
			escreva("\nO número médio de filhos é: ", mdf)
			escreva("\nO valor do maior salário é: ", maior)
			escreva("\nO percentual de pessoas que recebem salário até R$100 é: ", porc)
		}

}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 263; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */