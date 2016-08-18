import java.util.Scanner;
/* Receba 2 valores inteiros. 
 * Calcule e mostre o resultado da diferença do maior pelo menos valor.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static int calcularDiferenca(int numero1, int numero2){
  	int diferença;
  	
  	if(numero1 > numero2){
  		diferença = numero1 - numero2;
  	}
  	else{
  		diferença = numero2 - numero1;
  	}
  	return diferença;
  }	
  
  public static void main(String[] args) {
    int num1, num2;
    
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    
    System.out.println("Diferença do maior pelo menor: " + calcularDiferenca(num1, num2));
    
    
  }
}
