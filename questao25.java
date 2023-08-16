//Solicite ao usuário que insira seu ano de nascimento e concatene-o com uma mensagem de boas-vindas, como "Bem-vindo ao nosso programa, nascido em [ano de nascimento]!".
import java.util.Scanner;

public class questao25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira seu ano de nascimento: ");
        int ano = s.nextInt();
        String frase = "Bem-vindo ao nosso programa, nascido em " + ano + "!.";
        System.out.println(frase);
        s.close();
    }
}
