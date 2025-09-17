package EstruturaCondicional;
import java.util.Scanner;

/*
 * 
Problema "lanchonete" (adaptado de URI 1038) 
Uma lanchonete possui vários produtos. Cada produto possui um código e um preço. Você deve fazer um 
programa para ler o código e a quantidade comprada de um produto (suponha um código válido), e daí 
informar qual o valor a ser pago, com duas casas decimais, conforme tabela de produtos ao lado. 
*/
public class Lenchonete {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
            System.out.print("Codigo do produto comprado: ");
            int codigoProduto = sc.nextInt();
            System.out.print("Quantidade comprada: "); 
            int quantidade = sc.nextInt();
            
            Double valor;
            switch (codigoProduto) {
                case 1:
                valor = 5.0;
                    valor = valor * quantidade;
                    System.out.printf("Valor a pagar: R$ %.2f%n",valor);    
                break;

                case 2:
                    valor = 3.5;
                        valor = valor * quantidade;
                            System.out.printf("Valor a pagar: R$ %.2f%n",valor);    
                break;

                case 3:
                valor = 4.8;
                    valor = valor * quantidade;
                        System.out.printf("Valor a pagar: R$ %.2f%n",valor);    
                break;

                case 4:
                valor = 8.9;
                    valor = valor * quantidade;
                        System.out.printf("Valor a pagar: R$ %.2f%n",valor);    
                    break;
                    
                case 5:
                valor = 7.32;
                    valor = valor * quantidade;
                        System.out.printf("Valor a pagar: R$ %.2f%n",valor);    
                    break;
                
                default:
                System.out.println("Código ou valor invalido!");    
                    break;
            }
        sc.close();
    }


}
