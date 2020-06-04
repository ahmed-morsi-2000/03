

public class DoubleValue extends TwoDimensionArray{


    public DoubleValue(int number, String name, int ID) {
        super(number, name, ID);
    }


    public void getRealNumber(int x){
        System.out.println(super.getNumber() * x);
    }


    public static void main(String[] args) {
        DoubleValue DV = new DoubleValue(20, "Ahmed", 5);
        DV.getRealNumber(50);
    }

}


