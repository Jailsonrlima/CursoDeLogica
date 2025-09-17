package EstruturaSequencial;
import java.util.Scanner;
public class Idades {
    /*Problema "idades"  
Fazer um programa para ler o nome e idade de duas pessoas. Ao final mostrar uma mensagem com os 
nomes e a idade média entre essas pessoas, com uma casa decimal, conforme exemplo.
*/

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Dados da primeira pessoa:");
        System.out.print("Nome: ");
        String nome1 = sc.nextLine();
        System.out.print("Idade: ");
        int idade1 = sc.nextInt();
        
        System.out.println("Dados da segunda pessoa:");
        System.out.print("Nome: ");
        sc.nextLine(); // --------------> limpeza de buffer
        String nome2 = sc.nextLine();
        System.out.print("Idade: ");
        int idade2 = sc.nextInt();
        

        double media = ((idade1 + idade2) / 2.0);
             
       //System.out.println("A idade média de "+nome1 +"e"+ nome2+" é de "+ media +" anos"); ou
       System.out.printf("A idade media de %s e %s eh de %.1f anos", nome1, nome2, media);

    sc.close();
}

}
