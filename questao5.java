//Receba um número decimal do usuário e calcule o seu quadrado.
import java.util.Scanner;

public class questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva um número decimal: ");
        float n = s.nextFloat();
        double resultado = Math.pow(n, 2);
        System.out.println("O resultado do número ao quadrado é igual a " + resultado);
        s.close();
    }
}
