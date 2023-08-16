//Peça ao usuário para digitar a sua idade e, em seguida, informe quantos meses e quantos dias ele já viveu (considerando um ano com 365 dias).
import java.util.Scanner;

public class questao35 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite a sua idade: ");
        int idade = s.nextInt();
        int meses = idade * 12; 
        int dias = idade * 365; 
        System.out.println("Você viveu " + meses + " meses e " + dias + " dias.");
        s.close();
    }
}
