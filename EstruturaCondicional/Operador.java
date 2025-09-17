package EstruturaCondicional;
import java.util.Scanner;
/*
 * Problema "operadora" 
Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de 
telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para 
ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago. 
*/
public class Operador {
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    double plano = 50.0;
    int franquia = 100;
    
    System.out.print("Digite a quantidade de minutos: ");
    franquia = sc.nextInt();
    
    if (franquia > 100) {
        franquia = franquia - 100;
        plano = plano + (franquia * 2.0);
    System.out.printf("Valor a pagar: R$ %.2f",plano);
        
    } else {
        System.out.printf("Valor a pagar: R$ %.2f",plano);
    }
    sc.close();
}

}
