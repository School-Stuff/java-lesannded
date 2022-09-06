import java.text.DecimalFormat;
import java.util.concurrent.ThreadLocalRandom;

public class Ulesanne02 {
    public static void main(String[] args) {

        // Toll mille muudab meetriteks
        int toll = 2222;

        tollMeetriks(toll);

        // Ellipsi pindala
        double a = 22, b = 2;
        
        ellipsPindala(a, b);

        // minutid tundideks ja minutiteks
        int algMinutid = 222;

        minuttunnid(algMinutid);

        // leida kahe sportlase kiiruse
        double[] kiirused = sprotlasteKiirus();
        kiiruseVahe(kiirused[0], kiirused[1]);
        
        
    }


    static void tollMeetriks(int toll) {

        DecimalFormat df = new DecimalFormat("0.00");
        double meeter;

        meeter = toll / 39.370;

        System.out.println(toll + " tolli on " + df.format(meeter) + "m\n\n");
    }


    static void ellipsPindala(double a, double b) {

        DecimalFormat df = new DecimalFormat("0.00");
        double pindala;

        pindala = Math.PI * a * b;

        System.out.println("Ellipsi pindala - " + df.format(pindala)+"\n\n");
    }


    static void minuttunnid(int algMinutid) {
        int tunnid, minutid;
        tunnid = algMinutid / 60;
        minutid = algMinutid % 60;

        System.out.println(algMinutid + " Minutit on\n" + tunnid + " Tundi ja " +  minutid + " Minutit\n\n");
    }

    static double[] sprotlasteKiirus () {

        DecimalFormat df = new DecimalFormat("0.00");
        // km = kilomeetrid
        // random kilomeetrite miinimum ja maksimum
        double kiirus, km = 3, min = 10, max = 20;
       
        double kiirused[];
        kiirused = new double[2];

        for (int i = 0; i < 2; i++) {
            // annab random double muutuja aja jaoks
            double randomNum = ThreadLocalRandom.current().nextDouble(min, max + 1);
            // arvutab kiiruse ja lisab selle double array'sse
            kiirus = km / randomNum;
            kiirused[i] = kiirus;
            
            System.out.println(df.format(kiirus) + " km/h");
        }

        return kiirused;
        
    }

    static void kiiruseVahe(double kiirus1, double kiirus2) {

        DecimalFormat df = new DecimalFormat("0.00");
        double vahe;

        vahe = kiirus1 - kiirus2;
        // teeb negatiivse positiivseks
        vahe = Math.abs(vahe);

        System.out.println("kiiruse vahe on " + df.format(vahe) + "km/h\n\n");
    }
}
