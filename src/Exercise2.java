import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("benvenuto, dopo ogni inserimento premi invio.");
        System.out.println("inserisci il tuo saluto preferito");
        String saluto = input.nextLine();
        System.out.println("inserisci il tuo nome");
        String nome = input.nextLine();
        System.out.println("inserisci il tuo cognome");
        String cognome = input.nextLine();
        System.out.println(saluto + " " + nome + " " + cognome + "!");
        System.out.println("!" + cognome + " " + nome + " " + saluto );
        input.close();
    }
}
