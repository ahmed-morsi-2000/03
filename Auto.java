public class Auto {

    private int maxSpeed;
    private String color;
    private boolean workingGood;

    public Auto(boolean workingGood) {
        this.workingGood = workingGood;
    }

    public Auto(int maxSpeed, String color) {
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getColor() {
        return color;
    }
}
