import java.util.Scanner;
/* Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
 * Calcule e mostre a velocidade média em km/h.
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static int metrosEmKm(int voltas, int tamanho){
  	int tamanhoTotalEmKm;
  	tamanhoTotalEmKm = tamanho * voltas;
  	tamanhoTotalEmKm /= 1000;
  	return tamanhoTotalEmKm;
  }
  public static double calcularVelocidadeMedia(int voltas, int TamanhoDoCircuito, int tempoEmMinutos){
  	double tempoEmHoras;
  	double velocidadeMedia;
  	TamanhoDoCircuito = metrosEmKm(voltas, TamanhoDoCircuito);
  	
  	tempoEmHoras = tempoEmMinutos / 60;
  	velocidadeMedia = TamanhoDoCircuito / tempoEmHoras;
  	
  	return velocidadeMedia;
  }
  public static void main(String[] args) {
    int numeroDeVoltas, extensaoDoCircuito, duracaoEmMinutos;
	
	System.out.println("Digite o numero de voltas: ");
	Scanner inNumeroDeVoltas = new Scanner(System.in);
	numeroDeVoltas = inNumeroDeVoltas.nextInt();
    
    System.out.println("Digite a extensão do circuito: ");
	Scanner inExtencaoDocircuito = new Scanner(System.in);
	extensaoDoCircuito = inExtencaoDocircuito.nextInt();
	
	System.out.println("Digite a duração da corrida: ");
	Scanner inDuracaoEmMinutos = new Scanner(System.in);
	duracaoEmMinutos = inDuracaoEmMinutos.nextInt();
	
	System.out.println("Velocidade média: " + calcularVelocidadeMedia(numeroDeVoltas, extensaoDoCircuito, duracaoEmMinutos));
  }
}
