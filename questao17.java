//Solicite ao usuário que insira o seu estado civil e exiba uma mensagem apropriada (por exemplo: "Você é casado(a)", "Você é solteiro(a)", etc.).
import java.util.Scanner; 

public class questao17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite seu estado civil: ");
        String estadoCivil = s.next();
        System.out.println("Você é " + estadoCivil + "(a).");
        s.close();
    }
}
