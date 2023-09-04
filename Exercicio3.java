package exercicios5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Por favor, digite 10 numeros sem repetir\n");
		for(int i=0;i<10;i++) {
			System.out.println("Digite o "+(i+1)+"º numero: ");
			numeros.add(leia.nextInt());
		}
		System.out.println("\nDados do set: " + numeros);
	}

}
