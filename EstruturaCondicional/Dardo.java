package EstruturaCondicional;
import java.util.Scanner;
/*
 * Problema "dardo" 
No arremesso de dardo, o atleta tem três chances para lançar o dardo à maior distância que conseguir. 
Você deve criar um programa para, dadas as medidas das três tentativas de lançamento, informar qual 
foi a maior. 
*/
public class Dardo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

             System.out.println("Digite as tres distancias: ");
                double distancia1 = sc.nextDouble();
                    double distancia2 = sc.nextDouble();
                        double distancia3 = sc.nextDouble();

    if ((distancia1 > distancia2) && (distancia1 >distancia3 )) {
            System.out.printf("MAIOR DISTANCIA = %.2f%n",distancia1);
        }else if(distancia2 > distancia3){
            System.out.printf("MAIOR DISTANCIA = %.2f%n",distancia2);
            }else{
                System.out.printf("MAIOR DISTANCIA = %.2f%n",distancia3);
                    }
        sc.close();
        
    }
}
