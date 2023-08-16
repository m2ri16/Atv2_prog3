//Solicite ao usuário uma sequência de números separados por espaço e exiba quantos números foram digitados.
import java.util.Scanner;

public class questao8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite uma sequência de números separados por espaços: ");
        String sequencia = s.nextLine();
        String[] numeros = sequencia.split(" ");
        int quant = numeros.length; 
        System.out.println("A quantidade de numeros digitados foram de " + quant + ".");
        s.close();
    }
}
