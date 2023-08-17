//Solicite ao usuário que insira dois números decimais e calcule o resto da divisão entre eles.
import java.util.Scanner;

public class questao20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira o primeiro numero decimal: ");
        double n1 = s.nextDouble();
        System.out.print("Insira o segundo numero decimal: ");
        double n2 = s.nextDouble();
        double resto = n1 % n2;
        System.out.println("O resto da divisão entre eles é igual a " + resto + "."); 
        s.close();
    }
}
