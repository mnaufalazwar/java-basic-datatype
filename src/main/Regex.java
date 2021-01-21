package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[A-Z]+@[0-9]+\\.[A-Z]{2,6}", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("abc@123.com");

        if(matcher.find()){
            System.out.println("cocok");
        }
        else {
            System.out.println("gak cocok");
        }

    }

}
