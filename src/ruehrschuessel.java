public class ruehrschuessel extends behaelter implements verschliessbar, waschbar{
    double radius;
    double hoehe;

    public ruehrschuessel (double r, double h) {
        radius = r;
        hoehe = h;
    }

    @Override
    public double getVolumen() {
        return radius*radius*Math.PI*hoehe;
    }

    @Override
    public void verschliessen() {
        System.out.println("Ruehrschuessel: Deckel drauf");
    }

    @Override
    public void waschen() {
        System.out.println("Ruehrschuessel: wird gespült");
    }
}
