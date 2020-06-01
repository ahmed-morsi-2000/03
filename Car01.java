public class Car01 extends Auto{


    public Car01(int maxSpeed, String color) {
        super(maxSpeed, color);
        System.out.println("You maximum speed is "+ maxSpeed + " " + color + " which I think cool");
    }

    public static void main(String[] args) {
        Car01 car = new Car01(120, "Red");


    }


}

class Car02{
    public Car02() {
    }
}


