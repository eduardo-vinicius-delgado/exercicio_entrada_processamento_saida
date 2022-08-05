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
        int valor2 = sc.nextInt();
        int somaValores = sumValues(valor1, valor2);
        showMensage("A soma do valor 1 com o valor 2: " + somaValores + "\n");
        int multiplicacaoValores = multiplicationValues(valor1, valor2);
        showMensage("A multiplicação do valor 1 com o valor 2: " + multiplicacaoValores + "\n");
        double divisaoValores = divisionValues(valor1, valor2);
        showMensage(String.format("A divisão do valor 1 pelo valor 2: %.2f\n",divisaoValores));
        double exponenciacaoValores = Math.pow(valor1, valor2);
        showMensage(String.format("O valor 1 elevado pelo valor 2: %.2f\n",exponenciacaoValores));
        double radiciacaoValores = (double) Math.pow(valor1, 1/(double) valor2);
        showMensage(String.format("O valor 1 raiz pelo valor 2: %.2f\n",radiciacaoValores));
        sc.close();
    }

    public static void showMensage(String a){
        System.out.printf(a);
    }

    public static int sumValues(int a, int b){
        return (a+b);
    }

    public static int multiplicationValues(int a, int b){
        return(a*b);
    }

    public static double divisionValues(int a, int b){
        double auxiliar = (double) a/b;
        return auxiliar;
    }

}
    
