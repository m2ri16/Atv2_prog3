//Receba dois números inteiros do usuário e exiba a soma, a diferença, o produto e o quociente (divisão inteira) entre eles.
import java.util.Scanner;

public class questao30 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o seu primeiro numero inteiro: ");
        int n1 = s.nextInt(); 
        System.out.print("Digite o seu segundo numero inteiro: ");
        int n2 = s.nextInt(); 

        int soma = n1 + n2; 
        int sub = n1 - n2; 
        int mult = n1 * n2; 
        int div = n1 /n2; 

        System.out.println("soma = " + soma);
        System.out.println("subtração = " + sub);
        System.out.println("produto = " + mult);
        System.out.println("quociente = " + div);

        s.close();
    }
}
