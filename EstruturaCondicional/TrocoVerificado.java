package EstruturaCondicional;
import java.util.Scanner;
/*
 * Problema "troco_verificado" 
Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia. 
O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto, 
e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido 
ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o 
valor restante conforme exemplo. 
*/
public class TrocoVerificado {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double preco, valorRecebido, troco = 0.0, total;
        int quantidade;
        
        System.out.print("Digite o valor Unitário do produto: ");
        preco = sc.nextDouble();
        System.out.print("Informa a quantidade: ");
        quantidade = sc.nextInt();
        System.out.print("Digite o valor Recebido: ");
        valorRecebido = sc.nextDouble();
         
         total = quantidade * preco;
        
        if (valorRecebido >= total) {
            troco = (valorRecebido - total);
            System.out.printf("TROCO = R$ %.2f",troco);
        } else {
            valorRecebido = total - valorRecebido;
            System.out.printf("DINHEIRO INSUFICIENTE. FALTAM %.2f%s%n ",valorRecebido," REAIS");
        }
    
        System.out.println();
        sc.close();
    }

}
