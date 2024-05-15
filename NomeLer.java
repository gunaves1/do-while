package estruturaPosCondicionada;

import java.util.Scanner;

public class NomeLer {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int rep = 0;
		String nome;
		
		System.out.println("Informe seu nome: ");
		nome = ler.nextLine();
		
		while(rep < 10) {
			System.out.println(nome);
			rep++;
		}
		ler.close();
	}

}
