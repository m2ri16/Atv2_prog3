//Receba o nome de uma cidade do usuário e concatene-o com o nome do estado para formar uma mensagem completa, como "Você mora em [cidade], [estado].".
import java.util.Scanner;

public class questao24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome da cidade: ");
        String cidade = s.nextLine();
        System.out.print("Digite o nome do estado: ");
        String estado = s.nextLine();
        System.out.println("Você mora em " + cidade + ", " + estado + ".") ;
        s.close();
    }
}
