public class Exercise3 {
    public static void main(String[] args){
        double l1 = 12.5;
        double l2 = 19.3;
        double risultato = prm(l1, l2);
        System.out.println(risultato);
        System.out.println(evenOrOdd(7));
        System.out.println(erone(7.4, 3.5, 9.2));
    }
    public static double prm(double n1, double n2){
        return n1 + n2 * 2;
    }
    public static int evenOrOdd(int n1){
        if(n1%2 == 0){
            return 0;
        }
        return 1;
    }
    public static double erone(double l1, double l2, double l3){
        return Math.sqrt((l1 + l2 + l3) * (-l1 + l2 + l3) * (l1 - l2 + l3) * (l1 + l2 - l3)) / 4;
    }
}
