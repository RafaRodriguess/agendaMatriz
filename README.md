# Exercício agenda matriz
## Algoritmo e Fluxograma
### Algoritmo

Inicío
	
	var
	  DADO: conjunto[1..10,1..5] de cadeia
	  int i , j, k;
	  x : cadeia


	para i de 1 até 10 passo 1 faça
	  escreva "Nome ......" leia dado [i,1]
	  escreva "Nome ......" leia dado [i,2]
	  escreva "Nome ......" leia dado [i,3]
	  escreva "Nome ......" leia dado [i,4]
	  escreva "Nome ......" leia dado [i,5]
	fimpara

	para i de 1 até 9 passo 1 faça
	  para j de 1 + 1 até 10 passo 1 faça
	    se (dado[i,1] > dado[j,1]) entao
		para k de 1 até 5 passo 1 faça
		 x <- dado[i,k]
		 dado[i,k] <- dado[j,k]
		 dado[j,k] <- x
		fimpara
	     fimse
         fimpara
       fimpara

	para i de 1 até 10 passo 1 faça
	  para j de 1 até 5 passo 1 faça 
		escreva dado[i,j]
	  fimpara
	fimpara


Fim

### Fluxograma
![agendafluxo](https://user-images.githubusercontent.com/104536317/172459096-960d5622-d6d8-4ed4-aae6-3c720351ee2f.png)
