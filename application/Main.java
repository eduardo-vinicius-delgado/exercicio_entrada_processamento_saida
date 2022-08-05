package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        showMensage("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        showMensage("Digite o primeiro valor: ");
        sc.close();
    }

    public static void showMensage(String a){
        System.out.printf(a);
    }

}
    
