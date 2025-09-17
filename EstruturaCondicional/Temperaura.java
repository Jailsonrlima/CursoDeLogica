package EstruturaCondicional;
import java.util.Scanner;
/*
 * Problema "temperatura" 
Deseja-se converter uma medida de temperatura da escala Celsius para Fahrenheit ou vice-versa. Para 
isso, você deve construir um programa que leia a letra "C" ou "F" indicando em qual escala vai ser 
informada uma temperatura. Em seguida o programa deve mostrar a temperatura na outra escala com 

*/
public class Temperaura {
public static void main(String[] args) {
    double temperatura;
    Scanner sc =new Scanner(System.in);
    
        System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
            String letra = sc.nextLine();
                           
                if ((letra.equals("C") || letra.equals("c"))) {
                    System.out.print("Digite a temperatura em Celsius: ");
                        temperatura = sc.nextDouble();
                            temperatura = (temperatura * 1.8) + 32;
                                System.out.printf("Temperatura equivalente em Fahrenheit: %.2f%n",temperatura);
                    } else {
                        System.out.print("Digite a temperatura em Fahrenheit: ");
                            temperatura = sc.nextDouble();
                                temperatura = (temperatura - 32) * 5 / 9;
                                    System.out.printf("Digite a temperatura em Celsius: %.2f%n",temperatura);
                
            }
    sc.close();

}
}
