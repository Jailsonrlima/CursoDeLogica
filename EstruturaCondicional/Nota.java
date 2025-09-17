package EstruturaCondicional;
import java.util.Scanner;
/*
 * Problema "notas"  
Fazer um programa para ler as duas notas que um aluno obteve no primeiro e segundo semestres de 
uma disciplina anual. Em seguida, mostrar a nota final que o aluno obteve (com uma casa decimal) no 
ano juntamente com um texto explicativo. Caso a nota final do aluno seja inferior a 60.00, mostrar a 
mensagem "REPROVADO", conforme exemplos.
*/
public class Nota {
    public static void main(String[] args) {
      
    Scanner sc = new Scanner(System.in);
       double nt1, nt2, ntFinal;
        
        System.out.print("Digite a primeira nota: ");
            nt1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
            nt2 = sc.nextDouble();
        
        ntFinal = nt1 + nt2;
        
        System.out.printf("NOTA FINAL = %.1f%n", ntFinal);
        
            if (ntFinal < 60.0) {
                System.out.println("REPROVADO");
        }      
        
        sc.close();
    }

}
