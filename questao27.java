//Receba o nome de um produto digitado pelo usuário e concatene-o com o preço do produto, adicionando o símbolo de moeda da sua escolha.
import java.util.Scanner;

public class questao27 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva o nome de produto: ");
        String nome = s.nextLine(); 
        System.out.print("Digite o preço do produto: ");
        double preço = s.nextDouble();
        String frase = "O produto " + nome + " custa R$ " + preço +"!";
        System.out.println(frase);
        s.close();
    }
}
