public class Wardrobe extends Furniture{
    private int shelvesNumber;

    public Wardrobe(int mass, double square, int shelvesNumber) {
        super(mass, square);
        this.shelvesNumber = shelvesNumber;
    }

    public int getShelvesNumber() {
        return shelvesNumber;
    }

    @Override
    public void print() {
        System.out.println("В шкафу количество полок: " + shelvesNumber+
                          "\nЗанимает места м*м: " + getSquare()+
                           "\nВсего весит кг: " + getMass()+
                           "\n------------------------");
    }
}
