package EstruturaCondicional;
import java.util.Scanner;
/*
  *Problema "multiplos" (adaptado de URI 1044) 
Fazer um programa para ler dois números inteiros, e dizer se um número é múltiplo do outro. Os 
números podem ser digitados em qualquer ordem.
*/
public class Multiplos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;

	    System.out.println("Digite dois numeros inteiros:");
	    num1 = sc.nextInt();
	    num2 = sc.nextInt();

	    if (num1 % num2 == 0 || num2 % num1 == 0) {
	    	System.out.println("São multiplos");
	    }
	    else {
	    	System.out.println("Não são multiplos");
	    }
        
        sc.close();
    }

    


}
