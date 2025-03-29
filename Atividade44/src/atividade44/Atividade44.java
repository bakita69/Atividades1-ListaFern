
package atividade44;
import java.util.Scanner;

public class Atividade44 {

    public static void main(String[] args) {
        Double num, base, logaritimo;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com o logaritimo");
        num = ler.nextDouble();
        System.out.println("Entre com a base: ");
        base = ler.nextDouble();
        logaritimo = Math.log(num) / Math.log(base);
        System.out.print("No logaritmo de "+ num + " na base " + base +"e: " + logaritimo);
        
    }
    
}
