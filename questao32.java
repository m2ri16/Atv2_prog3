//Receba o raio de uma circunferência digitado pelo usuário e calcule o seu perímetro (2 * π * raio).
import java.util.Scanner;

public class questao32 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite o raio da circunferência: ");
        double raio = s.nextDouble();
        double perimetro = raio * 2 * 3.14 ; 
        System.out.print("O perímetro dessa circunfêrencia é de " + perimetro + ".");
        s.close();
    }
}
