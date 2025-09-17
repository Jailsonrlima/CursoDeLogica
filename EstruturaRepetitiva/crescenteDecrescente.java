package EstruturaRepetitiva;
import java.util.Scanner;
/*Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma 
mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente.*/
public class crescenteDecrescente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        
        System.out.println("Digite dois numeros");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("CRESCENTE!");
            } else {
                System.out.println("DECRESCENTE!");    
            }
            System.out.println("Digite outros dois numeros");
            x = sc.nextInt();
            y = sc.nextInt();
            
        }

        sc.close();
            
    }

}
