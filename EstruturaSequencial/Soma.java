package EstruturaSequencial;
import java.util.Scanner;
public class Soma {
/*Problema "soma" 
Fazer um programa para ler dois valores inteiros X e Y, e depois mostrar na tela o valor da soma destes 
números. 
*/
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o primeiro número inteiro:");
    int x = sc.nextInt();
    System.out.println("Informe o segundo número inteiro:");
    int y = sc.nextInt();
  
    int soma = x+y;

    System.out.println("Resultado da soma = "+soma);

    sc.close();
}
}
