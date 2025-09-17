package EstruturaSequencial;
import java.util.Scanner;
public class Terreno {
/*Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular com uma 
casa decimal, bem como o valor do metro quadrado do terreno com duas casas decimais. Em seguida, 
o programa deve mostrar o valor da área do terreno, bem como o valor do preço do terreno, ambos com 
duas casas decimais, conforme exemplo. */

public static void main(String[] args){
   double largura, comprimento,valorDoMetro,tamanhoDaArea,precoDoTerreno;

    Scanner sc = new Scanner(System.in);
    System.out.println("Digite a largura do terreno: ");
    largura = Double.parseDouble(sc.nextLine());
    System.out.println("Digite o comprimento do terreno: ");
    comprimento = Double.parseDouble(sc.nextLine());
    System.out.println("Digite o valor do metro quadrado: ");
    valorDoMetro = Double.parseDouble(sc.nextLine());

    tamanhoDaArea = largura * comprimento;
    precoDoTerreno = tamanhoDaArea * valorDoMetro; 

    System.out.printf("%s%.2f%n","Area do terreno = ",tamanhoDaArea);
    System.out.printf("%s%.2f%n","Preco do terreno = ",precoDoTerreno);

    sc.close();
   
}
}
