package exercicios5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<Integer>();
		int num;
		boolean achado = false;
		
		numeros.add(2);
		numeros.add(5);
		numeros.add(1);
		numeros.add(3);
		numeros.add(4);
		numeros.add(9);
		numeros.add(7);
		numeros.add(8);
		numeros.add(10);
		numeros.add(6);
		
		System.out.println("Tente adivinhar um numero: ");
		num = leia.nextInt();
		
		for(Integer numero : numeros){
			if(numero == num) {
				achado = true;
				break;
			}	
		}
		if (achado) {
		    System.out.println("O número " + num + " está na lista, parabens");
		} else {
		    System.out.println("O número " + num + " não está na lista.");
		}
	}

}
