public class pappkarton extends behaelter implements verschliessbar{
    double width;
    double length;
    double height;
    public pappkarton(double x, double y, double z) {
        width= x;
        length = y;
        height = z;
    }

    @Override
    public double getVolumen() {
        return width*length*height;
    }

    @Override
    public void verschliessen() {
        System.out.println("Pappkarton: zufalten");
    }
}
