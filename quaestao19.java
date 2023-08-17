//Peça ao usuário que digite a sua cidade e verifique se ela começa com a letra "S" (ou outra letra de sua escolha).
import java.util.Scanner; 

public class quaestao19 {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.print("Digite o nome da sua cidade: ");
        String cidade = s.nextLine();
        String[] caracteres = cidade.split("");
        if (caracteres[0].equals("S") || caracteres[0].equals("s")){
            System.out.println("O nome da sua cidade começa com S!");
        } else {
            System.out.println("O nome da sua cidade não começa com S!");
        }
        s.close();
    }
}
