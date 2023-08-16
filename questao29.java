//Receba uma string contendo um endereço de e-mail e concatene-a com uma mensagem de agradecimento personalizada.
import java.util.Scanner;

public class questao29 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu e-mail: ");
        String email = s.next(); 
        String frase =  "Obrigada por cadastrar seu e-mail " + email + "!"; 
        System.out.println(frase);
        s.close();
    }
}
