package artur.pdv.array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] valores = new int[4];

		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite a nota :" + (i + 1));

			valores[i] = sc.nextInt();
		}

		for (int i : valores) {
			System.out.println(i);
		}

		System.out.println("==============================================");

		int soma = 0;

		for (int i : valores) {
			soma += i;
		}

		System.out.println("Soma total das notas: " + soma);
		int media = soma / valores.length;
		System.out.println("Média totoal das notas: " + media);		
		
		if (media > 60) {
			System.out.println("Aprovado");
		}else {
			System.out.println("Reprovado");
		}
				

		int maior = valores[0];

		for (int nota : valores) {
			if (nota > maior) {
				maior = nota;
			}
		}
		
		System.out.println("Maior nota = " + maior);
		
		
		
		int menor = valores[0];

		for (int nota : valores) {
			if (nota < menor) {
				menor = nota;
			}
		}
		
		System.out.println("Menor nota = " + menor);
		
		
		
		

	}
}
