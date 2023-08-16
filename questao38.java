import java.util.Scanner;
//Receba três números inteiros digitados pelo usuário e exiba o resultado da operação (n1 + n2) * n3.

public class questao38 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número inteiro: ");
        int n1 = s.nextInt();
        System.out.print("Digite o segundo número inteiro: ");
        int n2 = s.nextInt();
        System.out.print("Digite o terceiro número decimal: ");
        int n3 = s.nextInt();
        int resultado = (n1 + n2) * n3;
        System.out.println("O resultado da equação é " + resultado + ".");
        s.close();
    }
}
