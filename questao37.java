import java.util.Scanner;
//Solicite ao usuário para digitar um número decimal e arredonde-o para o inteiro mais próximo.

public class questao37 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite um número decimal: ");
        double n = s.nextDouble();
        int inteiro = (int) n ; 
        System.out.println("O número arredondado em inteiro seria igual a " + inteiro + ".");
        s.close();
    }
}
