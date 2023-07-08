public abstract class Furniture implements Printable{
    private int mass;
    private double square;

    public Furniture(int mass, double square) {
        this.mass = mass;
        this.square = square;
    }

    public int getMass() {
        return mass;
    }

    public double getSquare() {
        return square;
    }
}
