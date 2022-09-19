import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class Ulesanne06 {
    // Karl Jugapuu
    public static void main(String[] args) {

        ArrayList<Integer> täisarvud = new ArrayList<Integer>();

        täisarvud = manus();

        //System.out.println();
        arvutused(täisarvud);
    }


    static ArrayList<Integer> manus() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> täisarvud = new ArrayList<Integer>();
        String str = "0";

        try {

            while (!str.isEmpty()) {

                System.out.print("Sisesta täisarv: ");
                str = scanner.nextLine();
                int number = Integer.parseInt(str);
                
                täisarvud.add(number);
                
            }
        }
        catch (NumberFormatException e) {
            //System.out.println("x");
        }

        scanner.close();
        return täisarvud;
    }


    static void arvutused(ArrayList<Integer> täisarvud) {

        int täisarvudKokku = 0;
        File file = new File("Numbrid.txt");
        
        for (int täisarv : täisarvud) {

            täisarvudKokku += täisarv;
            
        }

        int täisarvudeKeskmine = täisarvudKokku / täisarvud.size();

        System.out.println("\nTäisarvude kogu summa: " + täisarvudKokku);
        System.out.println("Täisarvude keskmine: " + täisarvudeKeskmine);
        try {

            BufferedWriter output = new BufferedWriter(new FileWriter(file));

            output.write("Täisarvude kogu summa: " + täisarvudKokku + "\n");
            output.write("Täisarvude keskmine: " + täisarvudeKeskmine);
            output.close();

            System.out.println("Fail on loodud");
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
