import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Inserisci un numero:");
    int num = sc.nextInt();
    stampaNumero(num);
    }
    static String stampaNumero(int num) {
        switch (num) {
            case 1:
                System.out.println("U N O");
                break;
            case 2:
                System.out.println("D U E");
                break;
                case 3:
                    System.out.println("T R E");
                    break;
                    default:
                        System.out.println("Errore il numero non puo' essere scritto, e' maggiore di 3");

        }
        return String.valueOf(num);
    }
}
