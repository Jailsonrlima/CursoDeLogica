package EstruturaCondicional;
import java.util.Locale;
import java.util.Scanner;
/*
 * 
Problema "tempo_de_jogo" (adaptado de URI 1046) 
Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo 
pode começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.  
*/
public class TempoDeJogo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int inicioDoJogo, fimDoJogo, duracao;

        System.out.print("Hora inicial: ");
        inicioDoJogo = sc.nextInt();
        System.out.print("Hora final: ");
        fimDoJogo = sc.nextInt();

        if (inicioDoJogo < fimDoJogo) {
            duracao = fimDoJogo - inicioDoJogo;
        } else {
            duracao = (24 - inicioDoJogo) + fimDoJogo;
        }
        System.out.println("O JOGO DUROU " + duracao +" HORA(S)");
            
        sc.close();
    }
}
