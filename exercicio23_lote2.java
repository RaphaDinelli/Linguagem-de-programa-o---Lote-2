import java.util.Scanner;
public class Exercicio23 {
    public static void colocarEMOrdem(int n1,int n2,int n3,int n4){
        if (n4 < n1){
    	System.out.println(n4+ ", " + n1 + ", " + n2 + ", " + n3);
    }
    else if (n4 < n2){
    	System.out.println(n1+ ", " + n4 + ", " + n2 + ", " + n3);
    }
    else if (n4 < n3){
    	System.out.println(n1+ ", " + n2 + ", " + n4 + ", " + n3);
    }
    else{
    	System.out.println("O quarto número digitado precisa estar fora da ordem crescente!");
    };
    }
    public static void main(String[] args) {
    int num1, num2, num3, num4;
    
    
    System.out.println("Digite o primeiro número: ");
    Scanner inNum1 = new Scanner(System.in);
    num1 = inNum1.nextInt();
    
    System.out.println("Digite o segundo número: ");
    Scanner inNum2 = new Scanner(System.in);
    num2 = inNum2.nextInt();
    
    System.out.println("Digite o terceiro número: ");
    Scanner inNum3 = new Scanner(System.in);
    num3 = inNum3.nextInt();
    
    System.out.println("Digite o quarto número: ");
    Scanner inNum4 = new Scanner(System.in);
    num4 = inNum4.nextInt();
    
    colocarEMOrdem(num1, num2, num3, num4);
}

    private static void colocarEmOrdem(int num1, int num2, int num3, int num4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
