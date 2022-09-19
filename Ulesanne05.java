import java.util.Scanner;

public class Ulesanne05 {
    // KARL JUGAPUU
    public static void main(String[] args) {

        int arv1, arv2;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {

            System.out.print("Sisesta arv1: ");
            arv1 = scanner.nextInt();

            System.out.print("Sisesta arv2: ");
            arv2 = scanner.nextInt();

            arvuKontroll(arv1, arv2);
        }
        
    }


    static void arvuKontroll (int arv1, int arv2) {

        if (arv1 < 0 || arv2 <= 0) {
            System.out.println("Midagi on valesti.");
        }
        else {

            double vastus = arv1 / arv2;

            System.out.println(vastus);

        }

        
    }
    
}
