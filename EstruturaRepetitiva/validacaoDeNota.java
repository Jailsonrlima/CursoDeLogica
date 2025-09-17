package EstruturaRepetitiva;
import java.util.Scanner;
/*Faça um programa que leia as notas referentes às duas avaliações de um aluno. Calcule e imprima a 
média semestral. Faça com que o algoritmo só aceite notas válidas (uma nota válida deve pertencer ao 
intervalo [0,10]). Cada nota deve ser validada separadamente.*/

public class validacaoDeNota {
    public static void main(String[] args) {
        double nm1,nm2,media;
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a Primeira nota: ");
        nm1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        nm2 = sc.nextDouble();
        
        while ((nm1 >= 0)&&(nm2 <= 10)) {
            if (nm1 <=0) {
                System.out.println("");
                
            } else {
                System.out.print("Digite a Primeira nota: ");
                nm1 = sc.nextDouble();
                System.out.print("Digite a segunda nota: ");
                nm2 = sc.nextDouble();
                
            }
        }
        media = (nm1+nm2)/2;
        System.out.println("MEDIA = "+media);
        sc.close();
    }

}
