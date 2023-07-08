public class Bed extends Furniture{
    private Boolean isMaterialWood;

    public Bed(int mass, double square, Boolean isMaterialWood) {
        super(mass, square);
        this.isMaterialWood = isMaterialWood;
    }

    public Boolean getMaterialWood() {
        return isMaterialWood;
    }

    @Override
    public void print() {
        System.out.println("Кровать деревянная?: " + isMaterialWood+
                "\nЗанимает места м*м: " + getSquare()+
                "\nВсего весит кг: " + getMass()+
                "\n------------------------");
    }
}
