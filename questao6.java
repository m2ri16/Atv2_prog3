//Peça ao usuário que insira o seu ano de nascimento e, em seguida, exiba a sua idade.
import java.util.Scanner;

public class questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira seu ano de nascimento: ");
        int ano = s.nextInt();
        int idade = 2023 - ano; 
        System.out.println("Sua idade é de " + idade + " anos.");
        s.close();
    }
}
