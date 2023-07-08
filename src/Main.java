public class Main {
    public static void main(String[] args) {
        Furniture A = createObject("Chair");
        Furniture B = createObject("Bed");
        Furniture C = createObject("Wardrobe");
        Furniture[] printables = {A, B, C};
        for (Furniture x: printables) {
            x.print();
        }

    }
    public static Furniture createObject(String className){
        switch (className){
            case "Bed":
                Bed bed = new Bed(100, 5.5, Boolean.TRUE);
                return bed;
            case "Chair":
                Chair chair = new Chair(5, 0.7, "Раскладной стул");
                return chair;
            case "Wardrobe":
                Wardrobe wardrobe = new Wardrobe(60, 2.5, 12);
                return wardrobe;
            default:
                return null;
        }
    }
}