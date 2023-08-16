//Solicite ao usuário que digite uma data no formato "dd/mm/aaaa" e extraia o dia, o mês e o ano separadamente, convertendo-os em números inteiros.
import java.util.Scanner; 

public class questao23 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Digite uma data no formato dd/mm/aaaa: ");
        String data = s.nextLine();
        String[] res = data.split("/");
        int dia = Integer.parseInt(res[0]);
        int mes = Integer.parseInt(res[1]);
        int ano = Integer.parseInt(res[2]);
        System.out.println("O dia é " + dia + ", o mês é " + mes + " e o ano é " + ano + ".");
        s.close();
    }
}
