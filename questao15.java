//Receba a altura e o peso de uma pessoa digitados pelo usuário. Em seguida, calcule o seu índice de massa corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura) e exiba o resultado.
import java.util.Scanner; 

public class questao15 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = s.nextDouble(); 
        System.out.print("Digite seu peso: ");
        double peso = s.nextDouble();
        double IMC = (peso / (altura * altura));
        System.out.println("O seu índice de massa corporal é " + IMC + ".");
        s.close();
    }
}
