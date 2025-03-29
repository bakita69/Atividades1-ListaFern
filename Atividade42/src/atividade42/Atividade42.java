
package atividade42;
import java.util.Scanner;

public class Atividade42 {

    public static void main(String[] args) {
        int angulo;
        double pi = Math.PI;
        double rang;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um angulo em graus: ");
        angulo = ler.nextInt();
        rang = angulo * pi /180;
        
        System.out.println("Seno: "+ Math.sin(rang)); 
        System.out.println("Co-seno: " + Math.cos(rang));
        System.out.println("Tangente: " + Math.tan(rang));
        System.out.println("Co-secante: "+ 1/Math.sin(rang));
        System.out.println("Secante: " + 1/Math.cos(rang));
        System.out.println("Cotangente: " + 1/Math.tan(rang));
        
    }
    
}
