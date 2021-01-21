package main;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReview {

    public static void main(String[] args) {

        ArrayList<String> mobils = new ArrayList<String>();

        mobils.add("toyota");
        mobils.add("Toyota");
        mobils.add("honda");
        mobils.add("mazda");
        mobils.add("audi");
        mobils.add("bmw");

        mobils.add(2, "tata");

//        Collections.sort(mobils);

        for(String mobil : mobils){
            System.out.println(mobil);
        }

        if(mobils.contains("bmw")){
            System.out.println("ada bmw");
            System.out.println(mobils.indexOf("tata"));
        }
        else {
            System.out.println("gak ada bmw");
        }

    }

}
