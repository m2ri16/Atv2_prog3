//Peça ao usuário que digite seu primeiro nome e seu sobrenome separadamente. Em seguida,concatene-os em uma única string e exiba o nome completo.
import java.util.Scanner; 

public class questao7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); 
        System.out.print("Digite seu primeiro nome: ");
        String nome = s.next(); 
        System.out.print("Digite seu sobrenome: ");
        String sobrenome = s.next(); 
        String nomeCompleto = nome + " " +  sobrenome; 
        System.out.println("Seu nome completo é " + nomeCompleto + ".");
        s.close();
    }
}
