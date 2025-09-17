package EstruturaSequencial;
import java.util.Scanner;
/*
 * Problema "consumo" 
Fazer um programa para ler a distância total (em km) percorrida por um carro, bem como o total de 
combustível gasto por este carro ao percorrer tal distância. Seu programa deve mostrar o consumo 
médio do carro, com três casas decimais.
*/
public class Consumo {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Distancia percorrida: ");
    int distancia = sc.nextInt();
    System.out.println("Combustível gasto: ");
    double combustivel = sc.nextDouble();
    
    double consumo = distancia / combustivel;

    System.out.printf("Consumo medio = %.3f", consumo);

    System.out.println("");

    sc.close();
}
}
