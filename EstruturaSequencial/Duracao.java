package EstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;
/*
 * Problema "duracao" 
Fazer um programa para ler uma duração de tempo em segundos, daí imprimir na tela esta duração no 
formato horas:minutos:segundos. 
*/
public class Duracao {
    public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
		int duracao, horas, minutos, segundos, resto;

        System.out.print("Digite a duracao em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600; //Conversão: valor correpondente a hora em segundos
        resto = duracao % 3600;

        minutos = resto / 60;  //valor correpondente ao em segundos
        segundos = resto % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);

        sc.close();
    }

}
