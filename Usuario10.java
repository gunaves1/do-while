package estruturaPosCondicionada;

import java.util.Scanner;

public class Usuario10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 1;
		String nome;

		System.out.println("Qual seu nome?");
		nome = ler.nextLine();

		while(i <= 10) {
			i++;
			System.out.println(nome);
		}
		ler.close();
	}

}
