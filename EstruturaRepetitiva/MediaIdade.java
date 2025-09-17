package EstruturaRepetitiva;
import java.util.Scanner;

/*Problema "media_idades"  
Faça um programa para ler um número indeterminado de dados, contendo cada um, a idade de um 
indivíduo. O último dado, que não entrará nos cálculos, contém um valor de idade negativa. Calcular 
e imprimir a idade média deste grupo de indivíduos. Se for entrado um valor negativo na primeira vez, 
mostrar a mensagem "IMPOSSIVEL CALCULAR".*/
public class MediaIdade {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade, contador = 0 , somaIdade = 0;
    double media;

System.out.println("Digite as idades:");
    idade = sc.nextInt();
    
    if (idade <= 0) {
        System.out.println("IMPOSSIVEL CALCULAR");
    }
    else {
        
        while (idade >= 0) {
            somaIdade = somaIdade + idade;
            contador++;
            idade = sc.nextInt();
        }

        media = somaIdade / contador ;

        System.out.printf("MEDIA = %.2f\n", media);
    }


    sc.close();
    }
}
