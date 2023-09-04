package exercicios5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		List<String> cores = new ArrayList<String>();
		
		System.out.println("Digite 5 cores: ");
		
		for(int i=0; i<5;i++) {
			System.out.println("Digite a cor: ");
			cores.add(leia.next());
		}
		System.out.println("Cores: "+cores);
		cores.sort(null);
		System.out.println("Em ordem crescente: "+cores);
		
		
	}

}
