
package atividades25;
import java.util.Scanner;

public class Atividades25 {

    public static void main(String[] args) {
        int data,dia,mes,ano;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite data no formato ddmmaa:  ");
        data = ler.nextInt();
        dia = data /10000;
        mes = data %10000 /100;
        ano = data %100;
        System.out.println("Dia: "+ dia);
        System.out.println("Mes: "+ mes); 
        System.out.println("Ano: "+ ano);
    }
    
}
