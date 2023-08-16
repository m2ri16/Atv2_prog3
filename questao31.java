//Peça ao usuário para digitar a base e a altura de um triângulo. Em seguida, calcule e exiba a área do triângulo.
import java.util.Scanner;

public class questao31 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        double base = s.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = s.nextDouble();
        double area = (base + altura) / 2;
        System.out.println("A área do triangulo é " + area  + ".") ;
        s.close();
    }
}
