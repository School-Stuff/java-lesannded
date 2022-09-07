import java.util.Scanner;

public class Ulesanne04 {
    // Karl Jugapuu
    public static void main(String[] args) {

        //String suvalineText = "%s ", lisa = "midagi";
        int sõna = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sisesta text: ");
        String suvalineText = scanner.nextLine();

        suvalineText = suvalineText.toUpperCase();


        System.out.println(suvalineText);
        System.out.println("teksti märkide arv: " +suvalineText.length());

        for(int i = 0; i < suvalineText.length(); i++) {

            if (suvalineText.charAt(i) == ' ') {

                sõna ++;
            }
        }

        System.out.println("tekstide sõnade arv: " + sõna);

        String[] sõnad = suvalineText.split(" ");
        System.out.printf("Esimene sõna lauses %s", sõnad[0]);

    }
}
