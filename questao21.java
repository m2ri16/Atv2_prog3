//Solicite ao usuário um número decimal e converta-o em um número inteiro.
import java.util.Scanner;

public class questao21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva um numero decimal: ");
        double numeroDecimal = s.nextDouble();
        int inteiro = (int) numeroDecimal; 
        System.out.println("O numero em inteiro ficaria " + inteiro + "."); 
        s.close();
    }
}
