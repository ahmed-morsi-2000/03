import java.util.Scanner;

public class Car01 extends Auto{


    public Car01(int maxSpeed, String color) {
        super(maxSpeed, color);
        System.out.println("You maximum speed is "+ super.getMaxSpeed() + " " + color + " which I think cool");
    }

    public static void main(String[] args) {
        int []val= {10, 20, 30, 40};
        Car01 car = new Car01(120, "Red");
        averageNumber(val);
        welcomeMessage("Ahmed Morsi");


    }

    private static void welcomeMessage(String d) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name here :");
        String name = sc.nextLine();
        System.out.println("Thanks so much for using our system: " + name);


    }


    public static void averageNumber(int[] values){

        int count =0;
        int average=0;

        for (int i=0; i<values.length; i++){
            count=count+values[i];
           average=count/values.length;

        }
        System.out.println(average);


    }


}

class Car02{
    public Car02() {
    }
}


