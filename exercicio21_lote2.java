import java.util.Scanner;
class main {
    public static void verificarNota(int n1, int n2, int n3, int n4){
        double media;
        
        media = (n1 + n2 + n3 + n4) / 4;
        if(media >= 6){
            System.out.println("APROVADO");
        }
        else if(media >= 3){
            System.out.println("EXAME");
        }
        else if(media < 3){
            System.out.println("REPROVADO");
        }
    }
    public static void main(String[] args) {
        int nota1, nota2, nota3, nota4;
        
        System.out.println("Digite a primeira nota: ");
        Scanner inNota1 = new Scanner(System.in);
        nota1 = inNota1.nextInt();
    
        System.out.println("Digite a segunda nota: ");
        Scanner inNota2 = new Scanner(System.in);
        nota2 = inNota2.nextInt();
    
        System.out.println("Digite a terceira nota: ");
        Scanner inNota3 = new Scanner(System.in);
        nota3 = inNota3.nextInt();
    
        System.out.println("Digite a quarta nota: ");
        Scanner inNota4 = new Scanner(System.in);
        nota4 = inNota4.nextInt();
        
        verificarNota(nota1, nota2, nota3, nota4);
    }
    
}
