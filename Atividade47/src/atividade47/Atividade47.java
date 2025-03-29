
package atividade47;

import java.util.Scanner;

public class Atividade47 {

    public static void main(String[] args) {
        int num, a, b, c, num1;
        Scanner ler = new Scanner(System.in);
        System.out.println();
        num = ler.nextInt();
        a = num /100;
        b = num %100 /10;
        c = num %10;
        num1 = c*100 + b*10 + a;
        System.out.println("Numero: " + num);
        System.out.println("Invertido: "+ num1);              
    }    
}
