
package atividade41;
import java.util.Scanner;

public class Atividade41 {

    public static void main(String[] args) {
        int a, b, c, d, mp;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com 1 numero: ");
        a = ler.nextInt();
        System.out.println("Entre com 2 numero: ");
        b = ler.nextInt();
        System.out.println("Entre com 3 numero: ");
        c = ler.nextInt();
        System.out.println("Entre com 4 numero: ");
        d = ler.nextInt();
        
        mp = (a*1 + b*2 + c*3 + d*4)/10;
        
        System.out.println("Media poderada: "+ mp);
        
    }
    
}
