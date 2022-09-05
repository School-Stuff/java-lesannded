import java.text.DecimalFormat;

public class Ulesanne02 {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("0.00");
        double toll = 22, meeter;

        meeter = toll / 39.370;

        System.out.println(df.format(meeter) + "m");

        // Ellipsi pindala
        double a = 22, b = 2, pindala;
        pindala = Math.PI * a * b;
        System.out.println("Ellipsi pindala - " + df.format(pindala));

        // minutid tundideks ja minutiteks
        double algMinutid = 222, tunnid, minutid;

        tunnid = algMinutid / 60;
    }
}
