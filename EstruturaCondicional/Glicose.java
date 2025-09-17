package EstruturaCondicional;
import java.util.Scanner;

/*
  * Problema "glicose" 
Fazer um programa para ler a quantidade de glicose 
no sangue de uma pessoa e depois mostrar na tela a 
classificação desta glicose de acordo com a tabela de 
referência ao lado. 
*/
public class Glicose {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
     double glicose;
    System.out.print("Digite a medida da glicose: ");
    glicose = sc.nextDouble();

    if (glicose <= 100) {
        System.out.println("Classificacao: normal");
    } else if(glicose <= 140){
        System.out.println("Classificacao: elevado"); 
    } else{
        System.out.println("Classificacao: diabetes");
    }
    sc.close();
}
}
