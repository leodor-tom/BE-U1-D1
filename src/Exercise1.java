import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int risultato = sum(9, 8);
        System.out.println(risultato);
        String testo1 = "Ho";
        String testo2 = "anni!";
        int eta = 21;
        String frase = conc(testo1, eta, testo2);
        System.out.println(frase);
        String[] arrayDiStringhe = {"ciao", "il",  "nome", "è", "Tommaso"};
        String aggiuntiva = "mio";
        String[] array = inserisci(arrayDiStringhe, aggiuntiva);
        System.out.println(Arrays.toString(array));
    }
    public static int sum(int n1, int n2){
        return  n1 * n2;
    }
    public static String conc(String str, int n1, String str2){
        return str + " " + n1 + " " + str2 ;
    }
    public static String[] inserisci(String[] arr, String str){
        String[] risultato = new String[6];
        risultato[0] = arr[0];
        risultato[1] = arr[1];
        risultato[2] = str;
        risultato[3] = arr[2];
        risultato[4] = arr[3];
        risultato[5] = arr[4];
        return risultato;
    }
}
