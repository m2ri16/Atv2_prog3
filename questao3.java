//Receba um número inteiro do usuário e converta-o em um número decimal (float).
import java.util.Scanner;

public class questao3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
            System.out.print("Escreva um numero inteiro:  ");       
            int n = s.nextInt(); 
            float resultado = (float) n; 
            System.out.println("numero em float: " + resultado);
            s.close();
    }
}
