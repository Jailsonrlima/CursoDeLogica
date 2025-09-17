package EstruturaCondicional;
import java.util.Scanner;
/*
 * Problema "menor_de_tres" 
Fazer um programa para ler três números inteiros. Em seguida, mostrar qual o menor dentre os três 
números lidos. Em caso de empate, mostrar apenas uma vez.
*/
public class MenorDeTreis {
public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int a,b,c;
    System.out.print("Primeiro valor: ");
        a = sc.nextInt();
        System.out.print("Segundo valor: ");
            b = sc.nextInt();
             System.out.print("Terceiro valor: ");
                c = sc.nextInt();

    if ((a < b) && (a < c )) {
        System.out.println("MENOR = "+a);
        
    } else if (b < c){
        System.out.println("MENOR = "+b);
        
    }else{
        System.out.println("MENOR = "+c);
    }

    sc.close();
}
}
