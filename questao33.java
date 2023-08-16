//Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule e exiba o perímetro do retângulo.
import java.util.Scanner;

public class questao33 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        double base = s.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = s.nextDouble();
        double perimetro = (base * 2 ) + (altura * 2); 
        System.out.println("O perimetro do retângulo é " + perimetro + " cm.");
        s.close();
    }    
}
