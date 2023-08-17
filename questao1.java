//Solicite ao usuário seu nome e imprima uma mensagem de boas-vindas na tela.
import java.util.Scanner;

public class questao1{
    public static void main(String[] args) {
        String nome;
        System.out.println("Escreva seu nome");
        Scanner s = new Scanner(System.in);
        nome = s.next();

        System.out.println("Boas vindas " + nome + "!");
        s.close();
    } 
}