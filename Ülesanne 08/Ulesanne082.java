public class Ulesanne082 {

    String kooliNimi;
    int opilasteArv;
    int opetajateArv;


    public Ulesanne082(String koolNimi, int opilaseArv, int opetajaArv) {
        
        kooliNimi = koolNimi;
        opilasteArv = opilaseArv;
        opetajateArv = opetajaArv;

    }


    public String toString() {
        return "Selle kooli nimi on " + kooliNimi + "\nSelle kooli õpilaste arv on " + opilasteArv + "\nSelle kooli õpetajate arv on " + opetajateArv + ".\n";
    }


    public void kooliNimi() {
        System.out.println("Kooli nimi on " + kooliNimi + ".\n");
    }


    public void kooliOpilArv() {
        System.out.println(kooliNimi + "es õpib " + opilasteArv + " õpilast.\n");
    }


    public void kooliOpeArv() {
        System.out.println(kooliNimi + "es töötab " + opetajateArv + " õpetajat.\n");
    }


    public void kooliLisaOpil(int mituOpil) {
        opilasteArv += mituOpil;
        System.out.println("Lisasite " + mituOpil + " õpilast juurde.\n");
    }


    public void kooliLisaOpe(int mituOpe) {
        opetajateArv += mituOpe;
        System.out.println("Lisasite " + mituOpe + " õpetajat juurde.\n");
    }

    // ei viitsi teha õpetajate ja õpilaste vähendamist
    public static void main(String[] args) {

        Ulesanne082 HaapsaluKutseHariduskeskus = new Ulesanne082("HaapsaluKutseHariduskeskus", 500, 90);

        System.out.println(HaapsaluKutseHariduskeskus);

        HaapsaluKutseHariduskeskus.kooliLisaOpe(20);
        HaapsaluKutseHariduskeskus.kooliLisaOpil(102);

        HaapsaluKutseHariduskeskus.kooliOpilArv();
        HaapsaluKutseHariduskeskus.kooliOpeArv();


        
    }
    
}
