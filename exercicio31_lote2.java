
import java.util.Scanner;
/* Calcule e mostre o quadrado dos números entre 10 e 150.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static void main(String[] args) {
    int numero, quadrado;
	
	for(numero = 10; numero <= 150; numero++ ){
		quadrado = numero * numero;
		System.out.println(numero + " - " + quadrado);
	}
  }
}
