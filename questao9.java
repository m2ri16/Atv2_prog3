//Receba o nome de um animal digitado pelo usuário e exiba uma mensagem informando qual animal foi digitado.
import java.util.Scanner;

public class questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite aqui: ");
        String animal = s.nextLine();
        System.out.println("O animal digitado foi o " + animal + "!");
        s.close();
    }
}
