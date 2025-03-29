
package atividade43;
import java.util.Scanner;
public class Atividade43 {

    public static void main(String[] args) {
        Double num, logaritimo;
        
        System.out.println("Entre com o logaritmando: ");
        Scanner ler = new Scanner(System.in);
        num = ler.nextDouble();
        logaritimo = Math.log(num)/ Math.log(10);
        System.out.println("Logaritimo: "+ logaritimo);       
    }  
}
