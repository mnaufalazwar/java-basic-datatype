package main;

public class ConvertingIntString {

    public static void main(String[] args) {

        int a = 123;
        String b = "456";
        double myDouble = 12.5;

        try {
            int c = 123 + Integer.parseInt(b);
            String d = Integer.toString(c);
            String doubleString = Double.toString(myDouble);
            double toTouble = Double.parseDouble(b);

            System.out.println("jumlah = " + d);
            System.out.println("double = " + doubleString);
        }
        catch(Exception e){
            System.out.println("error !!! " + e);
        }

    }

}
