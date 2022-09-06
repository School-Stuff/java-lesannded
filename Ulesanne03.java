public class Ulesanne03 {
    public static void main(String[] args) {

        int[] massiiv1d = {12,5,10,10,28,17,5,19,0,13,0,22,7,0,17,2,24,1,13,29,0,7,16,8,7,4,27,8,8,23,26,25,15,2,26,1};
        int kokku = 0;

        for (int num : massiiv1d) {
            kokku += num;
        }

        int massiviKesk = kokku / massiiv1d.length;

        System.out.println("Esimese elemendi väärtuse: " + massiiv1d[0] +
                            "\nViimase elemendi väärtuse: " + massiiv1d[massiiv1d.length-1] +
                            "\nElementide arvu massiivis: " + massiiv1d.length +
                            "\nElementide summa massiivis: " + kokku +
                            "\nArvude aritmeetilise keskmise: " + massiviKesk);

    }
}
