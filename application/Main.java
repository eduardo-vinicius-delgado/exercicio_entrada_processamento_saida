package application;

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int valor1 = 0, valor2 = 0, somaValores = 0;
        double multiplicacaoValores = 0.0, divisaoValores = 0.0, exponenciacaoValores = 0.0, radiciacaoValores = 0.0;
        System.out.print("Digite o primeiro valor: ");
        valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = sc.nextInt();
        somaValores = valor1 + valor2;
        System.out.println("Soma dos valores: "+somaValores);
        multiplicacaoValores = valor1 * valor2;
        System.out.printf("Multiplicacao dos valores: %.2f\n",multiplicacaoValores);
        divisaoValores = (double) valor1/valor2;
        System.out.printf("Divisao do valor 1 pelo valor 2: %.2f\n",divisaoValores);
        exponenciacaoValores = Math.pow(valor1, valor2);
        System.out.printf("Valor 1 elevado ao valor 2: %.2f \n", exponenciacaoValores);
        radiciacaoValores = Math.pow(valor1,1/(double) valor2);
        System.out.printf("Valor 1 como raiz quadrada do valor 2: %.2f", radiciacaoValores);

        sc.close();
    }
}
    
