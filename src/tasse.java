public class tasse extends behaelter implements waschbar{
    double radius;
    double hoehe;

    public tasse(double r, double h) {
        radius = r;
        hoehe = h;
    }

    @Override
    public double getVolumen() {
        return radius*radius*Math.PI*hoehe;
    }

    public void waschen() {
        System.out.println("Tasse: wird gespült");
    }
}
