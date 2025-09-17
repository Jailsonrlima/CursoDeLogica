package EstruturaSequencial;
import java.util.Scanner;
public class Circulo {
    /*
     * Problema "circulo"  
Fazer um programa para ler o valor "r" do raio de um círculo, e depois mostrar o valor da área do 
círculo com três casas decimais. A fórmula da área do círculo é a seguinte: 𝑎𝑟𝑒𝑎 = 𝜋.𝑟 . Você pode 
usar o valor de 𝜋 fornecido pela biblioteca da sua linguagem de programação, ou então, se preferir, use 
diretamente o valor 3.14159. 
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio do circulo: ");
        double raio = sc.nextDouble();

        double area = 3.14159 * Math.pow(raio,2);

        System.out.printf("AREA = %.3f",area);
        


        sc.close();
    }

}
