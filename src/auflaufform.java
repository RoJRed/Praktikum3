public class auflaufform extends behaelter implements waschbar, gefrierbar{
    @Override
    public double getVolumen() {
        return 0;
    }

    @Override
    public void waschen() {
        System.out.println("Auflaufform: wird gewaschen");
    }

    @Override
    public void gefrieren() {
        System.out.println("Gefrierbeutel: wird gefroren");
    }
}
