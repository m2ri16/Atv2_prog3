//Receba um número inteiro do usuário e concatene-o com uma mensagem, informando o dobro desse número.
import java.util.Scanner; 

public class questao28 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um numero inteiro: ");
        int n = s.nextInt();
        int dobro = n * 2;
        String string = Integer.toString(dobro);
        String frase = "O dobro do numero digitado é " + string + ".";
        System.out.print(frase);
        s.close();
    }
}
