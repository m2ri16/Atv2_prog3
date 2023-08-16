import java.util.Scanner;
//Peça ao usuário que digite uma temperatura em graus Celsius e a converta para Fahrenheit usando a fórmula: Fahrenheit = (Celsius * 9/5) + 32.

public class questao39 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a temp em graus Celsius: ");
        double Celsius = s.nextDouble();
        double Fahrenheit = (Celsius * 9/5) + 32;
        System.out.println("A conversão em Fahrenheit é " +Fahrenheit + ".");
        s.close();
    }
}
