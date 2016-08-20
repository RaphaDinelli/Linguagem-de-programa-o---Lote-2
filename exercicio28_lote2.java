import java.util.Scanner;
/* Receba o preço atual e a média mensal de um produto.Calcule e mostre o novo preço sabendo que:
 * Venda Mensal        Preço Atual   Preço Novo
   < 500                  < 30           + 10%
   >= 500 e < 1000    >= 30 e < 80       + 15%
   >= 1000                >= 80          - 5%
 * @Autor: Raphael Dinelli
 * Data da compilação: 06/08/2016
*/

class Main {
  public static double getNewPrice(int vendas, int preco){
  	if((vendas >= 1000)&&(preco >= 80)){
  		preco -= preco * 0.05;
  	}
  	else if((vendas >= 500)&&(preco >= 30)){
  		preco += preco * 0.15;
  	}
  	else if((vendas < 500)&&(preco < 30)){
  		preco += preco * 0.10;
  	}
  	return preco;
  }
	
  public static void main(String[] args) {
    int vendaMensal, precoAtual;
	
	System.out.println("Digite quantidade mensal de vendas: ");
	Scanner inVendaMensal = new Scanner(System.in);
	vendaMensal = inVendaMensal.nextInt();
    
    System.out.println("Digite o preço atual do produto: ");
	Scanner inPreçoAtual = new Scanner(System.in);
	precoAtual = inPreçoAtual.nextInt();
	
	System.out.println("O preço do produto reajustado é: R$" + getNewPrice(vendaMensal, precoAtual));
  }
}
