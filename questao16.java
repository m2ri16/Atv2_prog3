//Peça ao usuário que digite o seu nome e verifique se ele contém mais de 5 caracteres.
import java.util.Scanner;

public class questao16 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = s.next(); 
        String[] caracteres = nome.split("");
        if (caracteres.length > 5) {
            System.out.println("O seu nome tem mais de 5 caracteres. ");
        } else if(caracteres.length == 5) {
            System.out.println("Seu nome tem 5 caracteres.");
        } else {
            System.out.println("Seu nome tem menos de 5 caracteres. ");
        }
        s.close();
    }
}
