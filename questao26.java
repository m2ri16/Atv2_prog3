//Receba um número inteiro e uma string do usuário. Em seguida, concatene-os em uma única string, separando-os com um espaço.
import java.util.Scanner;

public class questao26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = s.nextInt();
        System.out.print("Digite a string: ");
        String string = s.next();
        String frase = numero + " " + string;
        System.out.println(frase);
        s.close();
    }
}
