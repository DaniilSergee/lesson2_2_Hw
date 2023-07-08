public class Chair extends Furniture{
    private String chairType;

    public Chair(int mass, double square, String chairType) {
        super(mass, square);
        this.chairType = chairType;
    }

    public String getChairType() {
        return chairType;
    }

    @Override
    public void print() {
        System.out.println("Тип кресла : " + chairType+
                "\nЗанимает места м*м: " + getSquare()+
                "\nВсего весит кг: " + getMass()+
                "\n------------------------");
    }
}
