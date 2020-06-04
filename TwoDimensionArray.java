public class TwoDimensionArray {

    private static int count=10;
    private int number;
    private String name;
    private int ID;

    public TwoDimensionArray(int number, String name, int ID) {
        this.number = number;
        this.name = name;
        this.ID = ID;
    }

    public int getNumber() {
        return number * count;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}
