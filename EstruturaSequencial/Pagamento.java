package EstruturaSequencial;

import java.util.Scanner;
public class Pagamento {
    /*
     * Problema: "pagamento"
     * Fazer um programa para ler o nome de um(a) funcionário(a), o valor que ele(a) recebe por hora, e a 
quantidade de horas trabalhadas por ele(a). Ao final, mostrar o valor do pagamento do funcionário com 
uma mensagem explicativa, conforme exemplo. 
    */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o nome do funcionario:");
    String nome = sc.nextLine();
    System.out.println("Informa o valor da hora trabalahado:");
    double valorHora = sc.nextDouble();
    System.out.println("Digite a quantidade de horas trabalhadas:");
    int horasTrabalhadas = sc.nextInt();
    
    double pagamento = (horasTrabalhadas * valorHora);

    System.out.printf("O pagamento para %s deve ser %.2f",nome,pagamento,"%n");

    sc.close();
    
}
}
