import java.util.Scanner;
//Receba um valor em reais e a cotação do dólar digitados pelo usuário. Em seguida, converta o valor para dólares e exiba o resultado.

public class questao36 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o valor em real: ");
        double real = s.nextDouble();
        System.out.print("Digite a cotação do dólar: ");
        double dolar = real / s.nextDouble();
        System.out.println("O valor é igual a " + dolar + " dólares." );
        s.close();
    }
}
