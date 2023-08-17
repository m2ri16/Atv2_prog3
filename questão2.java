//Peça ao usuário que digite sua idade em texto (por exemplo, "18") e converta-a em um número inteiro.
import java.util.Scanner;

public class questão2 {
    public static void main(String[] args) {
     Scanner s = new Scanner(System.in) ;
     System.out.print("Digite sua idade: ");  
     String idade = s.next(); 
     int idade2 = Integer.parseInt(idade);
     System.out.println(idade2);
     s.close();
    }
    
}
