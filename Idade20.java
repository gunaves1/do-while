package estruturaPosCondicionada;

import java.util.Scanner;

public class Idade20 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0, idade = 0, i = 0;
		
		while(i <= 20) {
			System.out.println("Informe sua idade:");
			idade = ler.nextInt();
			i++;
			if(idade >= 18) {
				soma++;
			}
		}
		System.out.println("A quantidade de pessoas que são maiores de idade é "+soma);
		ler.close();
	}

}
