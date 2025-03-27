
package atividade23;

import java.util.Scanner;

public class Atividade23 {

    public static void main(String[] args) {
        int a, b;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero das tres casas: ");
        a = ler.nextInt();
        b = a %100 /10;
        System.out.println("\n Algarismo da casa das dezenas: " + b);
        System.out.println("\n");               
    }
    
}
