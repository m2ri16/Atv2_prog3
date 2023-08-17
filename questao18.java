//Receba a base e a altura de um retângulo digitados pelo usuário. Em seguida, calcule a sua área e exiba o resultado.
import java.util.Scanner; 

public class questao18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Escreva a base do retângulo: ");
        double base = s.nextDouble();
        System.out.print("Escreva altura do retângulo: ");
        double altura = s.nextDouble();
        double area = base * altura;
        System.out.println("A área do retêngulo é igual a " + area + ".");
        s.close();
    }
}
