
package atividade40;
import java.util.Scanner;

public class Atividade40 {

    public static void main(String[] args) {
        int quoc, rest, val1, val2;
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Entre com dividendo: ");
        val1 = ler.nextInt();        
        System.out.println("Entre com o divisor: ");
        val2 = ler.nextInt();
        quoc = val1 / val2;
        rest = val1 % val2;
        System.out.println("Dividendo: " + val1);
        System.out.println("Divisor: " + val2);
        System.out.println("Quociente: " + quoc);
        System.out.println("Resto: " + rest);       
    }   
}
