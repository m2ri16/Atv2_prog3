//Peça ao usuário que digite o seu nome e o seu sobrenome. Em seguida, exiba o nome completo invertido (sobrenome, nome).
import java.util.Scanner;

public class questao10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = s.next(); 
        System.out.print("Digite seu nome: ");
        String nome = s.next(); 
        System.out.println("(" + sobrenome + ", " +  nome + ")"); 
        s.close();
    }
}
