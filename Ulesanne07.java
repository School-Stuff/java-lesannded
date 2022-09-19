import java.util.Scanner;

public class Ulesanne07 {
    public static void main(String[] args) {
        
        aritmeetilineTehe();

    }

    static void aritmeetilineTehe() {

        Scanner sc = new Scanner(System.in);
        int arv1 = 0, arv2 = 0;
        
        while (true) {
            try {
                
                System.out.print("Sisesta arv1: ");
                arv1 = sc.nextInt();

                System.out.print("Sisesta arv2: ");
                arv2 = sc.nextInt();

                int kokku = arv1 + arv2;
                System.out.println(kokku);

            }
            catch (Exception e) {

                System.out.println("\nSisestage arv mitte täht!");

                sc.next();
                
            }

            
        }
    }
    
}
