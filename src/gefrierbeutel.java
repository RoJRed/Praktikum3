public class gefrierbeutel extends behaelter implements verschliessbar, gefrierbar{
    @Override
    public double getVolumen() {
        return 0;
    }

    @Override
    public void verschliessen() {
        System.out.println("Gefrierbeutel: zippen");
    }

    @Override
    public void gefrieren() {
        System.out.println("Gefrierbeutel: wird gefroren");
    }
}
