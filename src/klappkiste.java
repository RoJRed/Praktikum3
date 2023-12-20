public class klappkiste extends behaelter {
    double width;
    double length;
    double height;
    public klappkiste(double x, double y, double z) {
        width= x;
        length = y;
        height = z;
    }

    @Override
    public double getVolumen() {
        return width*length*height;
    }
}
