package estruturaPosCondicionada;

import java.util.Scanner;

public class Soma10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int i = 1, numero = 0; 

		while(i <= 10) {
			System.out.println("Digite um número: ");
			numero += ler.nextInt();
			i++;
		}
		System.out.println("A soma dos números é " + numero);
		ler.close();
	}
}
