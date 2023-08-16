//Peça ao usuário que insira dois números e exiba o maior deles.
import java.util.Scanner;

public class questao14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.print("Digite o segundo número: ");
        int n2 = s.nextInt();

        if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo número!");
        } else if(n1 == n2){
            System.out.println("Os números são iguais!");
        } else {
            System.out.println("O segundo número é maior que o primeiro!");
        }
        s.close();
    }
}
