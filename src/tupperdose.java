public class tupperdose extends behaelter implements verschliessbar, waschbar, gefrierbar{
    @Override
    public double getVolumen() {
        return 0;
    }
    @Override
    public void verschliessen() {
        System.out.println("Tupperdose: Deckel drauf");
    }

    @Override
    public void waschen() {
        System.out.println("Tupperdose: wird gewaschen");
    }

    @Override
    public void gefrieren() {
        System.out.println("Tupperdose: wird gefroren");
    }
}
