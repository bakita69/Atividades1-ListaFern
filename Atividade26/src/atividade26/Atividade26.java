
package atividade26;

import java.util.Scanner;

public class Atividade26 {

    public static void main(String[] args) {
        int data,dia,mes,ano,ndata;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite data no formato ddmmaa:  ");
        data = ler.nextInt();
        dia = data /10000;
        mes = data %10000 /100;
        ano = data %100;
        ndata = mes*10000 + dia*100 + ano;
        System.out.println("Dia: "+ dia);
        System.out.println("Mes: "+ mes); 
        System.out.println("Ano: "+ ano);
        System.out.println("DATA  NO FORMATO MMDDAA: " + ndata);
    }
}
