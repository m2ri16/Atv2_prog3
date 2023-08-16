//Receba um número inteiro digitado pelo usuário e verifique se ele é positivo ou negativo.
import java.util.Scanner; 

public class questao13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int n = s.nextInt();

        if (n >= 1) {
            System.out.println("O número é positivo!");
        }
        else if(n == 0){
            System.out.println("O número não é positivo nem negativo!");
        } else {
           System.out.println("O número é negativo!"); 
        }

        s.close();
    }
}
