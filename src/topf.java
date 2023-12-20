public class topf extends behaelter implements verschliessbar, waschbar{
    double radius;
    double hoehe;
    public topf(double r, double h) {
        radius = r;
        hoehe = h;
    }

    @Override
    public double getVolumen() {
        return radius*radius*Math.PI*hoehe;
    }

    @Override
    public void verschliessen() {
        System.out.println("Topf: Deckel drauf");
    }

    @Override
    public void waschen() {
        System.out.println("Topf: wird geschrubbt");
    }
}
