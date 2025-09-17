package EstruturaSequencial;
import java.util.Scanner;
public class Troco {
    /*
     * Problema "troco" 
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
e o valor em dinheiro dado pelo cliente (suponha que haja dinheiro suficiente). Seu programa deve 
mostrar o valor do troco a ser devolvido ao cliente.
    */
public static void main(String[] args) {
    double preco, valorRecebido, troco;
    int quantidade;
    Scanner sc = new Scanner(System.in);
    System.out.println("Informa a quantidade:");
    quantidade = sc.nextInt();
    System.out.println("Digite o valor Unitário do produto:");
    preco = sc.nextDouble();
    System.out.println("Digite o valor Recebido:");
    valorRecebido = sc.nextDouble();
    
    troco = ((quantidade * preco) - valorRecebido);
    
    System.out.printf("TROCO = R$%.2f",troco);

    System.out.println();
    sc.close();
}
}
