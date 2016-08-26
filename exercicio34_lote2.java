import java.util.Scanner;

/* Receba 2 valores inteiros. 
 * Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main{
	static void mostrartabuada(int num){
		for(int i=0; i <= 10; i++){
			int total = i * num;
			System.out.printf("%2d X %2d = %2d\n", i, num, total);
		}
	}
	public static void main(String[] args){
		int numero;
		System.out.println("Digite um número inteiro: ");
		Scanner inNumero = new Scanner(System.in);
		numero = inNumero.nextInt();
		mostrartabuada(numero);
		
	}
}
