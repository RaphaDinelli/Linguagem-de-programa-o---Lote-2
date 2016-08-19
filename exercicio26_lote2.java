import java.util.Scanner;
/*Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static boolean multiplo(int num1, int num2){
      boolean mult = true;
      int maior, menor;
      if (num1 > num2){
          maior = num1;
          menor = num2;
      }
      else{
          maior = num2;
          menor = num1;
      }
      if(maior % menor != 0){
         mult = false;
      }
      return mult
  }
  public static void main(String[] args) {
    int numero1, numero2;
   
    System.out.println("Digite um número inteiro: ");
    Scanner inNumero1 = new Scanner(System.in);
    numero1 = inNumero1.nextInt();
    
    System.out.println("Digite outro número inteiro: ");
    Scanner inNumero2 = new Scanner(System.in);
    numero2 = inNumero2.nextInt();
    
    if(multiplo(numero1, numero2)){
        System.out.println("O maior número é multiplo do menor número!");
    }
    else{
        System.out.println("O maior número não é multiplo do menor número!");
    }
  }
};
