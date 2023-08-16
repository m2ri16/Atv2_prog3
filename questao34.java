import java.util.Scanner;
//Solicite ao usuário que insira três números decimais. Em seguida, calcule e exiba a média aritmética desses números.


public class questao34 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite o primeiro número decimal: ");
        double n1 = s.nextDouble();
        System.out.print("Digite o segundo número decimal: ");
        double n2 = s.nextDouble();
        System.out.print("Digite o terceiro número decimal: ");
        double n3 = s.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.print("A média aritmetrica é " + media + ".");
        s.close();
    }
}
