package EstruturaSequencial;
import java.util.Scanner;
public class Retangulo {
    /*Fazer um programa para ler as medidas da base e altura de um retângulo. Em seguida, mostrar o valor 
      da área, perímetro e diagonal deste retângulo, com quatro casas decimais, conforme exemplos.
    */
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("informe a base do retangulo:");
        base = Float.parseFloat(sc.nextLine());
        System.out.println("informe a altura do retangulo:");
        altura = Float.parseFloat(sc.nextLine());
        
        area = altura * base;
        double perimetro = 2 * (base + altura);
        double diagonal = Math.sqrt((Math.pow(altura, 2)+ Math.pow(base, 2)));

        System.out.printf("%n%S%.4f","AREA = ",area);
        System.out.printf("%n%S%.4f","perimetro = ",perimetro);
        System.out.printf("%n%S%.4f","diagonal = ",diagonal);
        System.out.println("\n");


        sc.close();
    }

}
