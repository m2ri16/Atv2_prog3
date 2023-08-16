//Receba uma string digitada pelo usuário e imprima o seu tamanho (número de caracteres).
import java.util.Scanner;

public class questao11 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a palavra aqui: ");
        String palavra = s.nextLine();
        String[] caracteres = palavra.split(""); 
        System.out.println("A quantidade de caracteres é de " + caracteres.length + ".");
        s.close();
    }
}
