import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Ulesanne02 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double toll = 22, meeter;

        meeter = toll / 39.370;

        System.out.println(df.format(meeter) + "m\n\n");

        // Ellipsi pindala
        double a = 22, b = 2, pindala;
        pindala = Math.PI * a * b;
        System.out.println("Ellipsi pindala - " + df.format(pindala)+"\n\n");

        // minutid tundideks ja minutiteks
        int algMinutid = 222, tunnid, minutid;

        tunnid = algMinutid / 60;
        minutid = algMinutid - (tunnid * 60);

        System.out.println(algMinutid + " Minutit on\n" + tunnid + " Tundi ja " +  minutid + " Minutit\n\n");

        // leida kahe sportlase kiiruse
        // km = kilomeetrid ja h = minutid
        double km = 3, kiirus, vahe;
        double kiirused[];
        kiirused = new double[2];

        double min = 10, max = 20;
        for (int i = 0; i < 2; i++) {
            // annab random double muutuja aja jaoks
            double randomNum = ThreadLocalRandom.current().nextDouble(min, max + 1);
            // arvutab kiiruse ja lisab selle double array'sse
            kiirus = km / randomNum;
            kiirused[i] = kiirus;
            
            System.out.println(df.format(kiirus) + " km/h");

        }

        vahe = kiirused[0] - kiirused[1];
        // teeb negatiivse positiivseks
        vahe = Math.abs(vahe);

        System.out.println("kiiruse vahe on " + df.format(vahe) + "km/h\n\n");
        
    }
}
