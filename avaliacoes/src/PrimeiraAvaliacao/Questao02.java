package PrimeiraAvaliacao;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor da Temperatura em °C:");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9/5) + 32;
        double kelvin = celcius+273.15;
        System.out.println("==== Escala de Temperaturas ====");
        System.out.printf("Temperatura em Celcius %.1f °C \n", celcius);
        System.out.printf("Temperatura em Fahrenheit %.1f F \n", fahrenheit);
        System.out.printf("Temperatura em Kelvin %.1f F \n", kelvin);
        System.out.println("================================");
    }
}