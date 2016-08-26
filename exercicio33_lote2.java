import java.util.Scanner;

/* Receba 2 valores inteiros. 
 * Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main{
	static double calcularSerie(int n){
		final int inicial = 1;
		int acumulador = 2;
		double serie = 0;
		
		for(int i = acumulador; i <= n; i++){
			serie += inicial / i;
		}
		serie += 1;
		return serie;
	}
	public static void main(String[] args){
		int numero;
		System.out.println("Digite um número inteiro: ");
		Scanner inNumero = new Scanner(System.in);
		numero = inNumero.nextInt();
		System.out.println("Total da serie é: " + calcularSerie(numero));
	}
}
