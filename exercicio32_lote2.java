import java.util.Scanner;
/* Receba um número inteiro. Calcule e mostre o seu fatorial.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static int Calcularfatorial(int num){
  	int fat = 1;
  	for(int i = 1; i < num; i++){
  		fat *= i + 1;
  	}
  	return fat;
  }
  public static void main(String[] args) {
    int numero;
    System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
    
    System.out.println("Fatorial de " + numero + " é: " + Calcularfatorial(numero));
  }
}
