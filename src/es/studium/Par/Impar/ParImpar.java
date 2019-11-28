package es.studium.Par.Impar;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args)
	{
		int numero;
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla
		System.out.println("Dame un número");
		//LEER numero
		numero = teclado.nextInt();
		if(numero%2==0) {
			System.out.println("El numero es Par");
		}
		else
		{
			System.out.println("El numero es Impar");
		}
		teclado.close();
	}
}
