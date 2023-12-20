public class MainClass {
    public static void main(String[] args) {
        verschliessbar L1[] = new verschliessbar[3];
        waschbar L2[] = new waschbar[5];
        gefrierbar L3[] = new gefrierbar[2];
        behaelter B[] = new behaelter[2];

        L1[0] = new topf(10, 10);
        L1[1] = new gefrierbeutel();
        L1[2] = new tupperdose();

        L2[0] = new auflaufform();
        L2[1] = new tasse(5, 5);
        L2[2] = new ruehrschuessel(10, 10);

        L3[0] = new gefrierbeutel();
        L3[1] = new tupperdose();

        B[0] = new pappkarton(15, 15, 15);
        B[1] = new klappkiste(25, 25, 20);


        for (int i=0; i<2;i++) {
            L1[i].verschliessen();
            L2[i].waschen();
            L3[i].gefrieren();
            System.out.println("Behaelter Volumen: "+ B[i].getVolumen());
        }
    }
}
