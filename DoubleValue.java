public class DoubleValue {

    public static void main(String[] args) {
        int[] val = {10, 20, 30};
        doubleValue(val);
    }

    private static void doubleValue(int[] val) {

        for (int i=0; i<val.length; i++){
            val[i]= val[i]*val[i];
            System.out.println(val[i]);
        }


    }


}
