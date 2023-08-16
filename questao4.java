//Peça ao usuário para digitar dois números inteiros e exiba a soma deles.
import java.util.Scanner;

public class questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();
        int resultado = n1 + n2;
        System.out.println("O resultado da soma é " + resultado + ".");
        s.close();
    }
}
