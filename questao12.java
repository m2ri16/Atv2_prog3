//Solicite ao usuário um número inteiro e exiba se ele é par ou ímpar.
import java.util.Scanner;

public class questao12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();
        if (n % 2 == 0 ) {
            System.out.println("O número digitado é par!");
        }
        else{
            System.out.println("O número digitado é impar!");
        }
        s.close();
    }
}
