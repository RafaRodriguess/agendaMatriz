package Matriz;

import java.util.Scanner;

public class agendaMatriz {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// variaveis para usar no for
		int i, j;
		String agenda_cadastro[][] = new String[10][5];
		// for para printar e recener os dados do cliente
		// enquanto o i for menor que 10, ira repetir
		for (i = 0; i < 10; i++) {
			System.out.printf(
					"Digite as informações do %do cliente:\nNome, Endereço, Código Postal, Bairro e Telefone\n", i + 1);
			System.out.printf("Nome: ");// perguntando nome
			agenda_cadastro[i][0] = sc.nextLine();// recebendo nome
			System.out.printf("Endereço: ");// perguntando endereço
			agenda_cadastro[i][1] = sc.nextLine();// recebendo endereço
			System.out.printf("Código Postal: ");// perguntando codigo
			agenda_cadastro[i][2] = sc.nextLine();// recebendo codigo
			System.out.printf("Bairro: ");// perguntando bairro
			agenda_cadastro[i][3] = sc.nextLine();// recebendo bairro
			System.out.printf("Telefone: ");// perguntando telefone
			agenda_cadastro[i][4] = sc.nextLine();// recebendo telefone
			// quebra linha
			System.out.println();
		} // fim for

		// for para printar os dados
		// for para printar a linha
		for (i = 0; i < 10; i++) {
			// for para printar a coluna
			for (j = 0; j < 5; j++) {
				System.out.printf("%s | ", agenda_cadastro[i][j]);// printando dados da posicao i,j
			} // fim for j
			System.out.println();
		} // fim for i
		sc.close();
	}
}// fim