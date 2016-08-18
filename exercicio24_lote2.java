import java.util.Scanner;
public class Exercicio24 {
    public static void divisivel(int number){
        if(number % 2 ==0){
            if (number % 3 ==0){
                System.out.println(number+ " é divísivel por 2 e 3");
            }
            else{
                System.out.println(number+ " é divísivel apenas por 2");
            }
        }
        else if(number % 3 ==0){
            System.out.println(number+ " é divísivel apenas por 3");
        }
        else{
            System.out.println(number+ " não é divísivel por 2 nem 3.");
        }
        
    }
    public static void main(String[] args) {
    int numero;
    
    
    System.out.println("Digite um número inteiro: ");
    Scanner inNumero = new Scanner(System.in);
    numero = inNumero.nextInt();
    
    divisivel(numero);
}
}
