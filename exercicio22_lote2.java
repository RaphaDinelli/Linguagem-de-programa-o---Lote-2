import java.util.Scanner;
public class Exercicio22 {
    public static void colocarEmOrdem(int numero1, int numero2){
        if(numero1 < numero2){
            System.out.println(numero1 + ", " + numero2);
        }
        else{
            System.out.println(numero2 + ", " + numero1);
        }
    }
    public static void main(String[] args) {
    int num1, num2;
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    colocarEmOrdem(num1, num2);
  }
}
