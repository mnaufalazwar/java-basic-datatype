package main;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapReview {

    public static void main(String[] args) {

        HashMap<String, Integer> score = new HashMap<>();

        boolean cobaLagi = true;

        while (cobaLagi){

            Scanner scanner = new Scanner(System.in);

            System.out.print("nama : ");
            String nama = scanner.nextLine();
            System.out.println(nama + " dimasukan");

            if(score.containsKey(nama)){
                score.put(nama, (score.get(nama) + 1));
            }
            else{
                score.put(nama, 1);
            }

            System.out.println("tambah lagi?");
            boolean temp = scanner.nextBoolean();
            cobaLagi = temp;
        }

        System.out.println(score);

        System.out.println(score.keySet());

        for(String key : score.keySet()){
            System.out.println(score.get(key));
        }

    }

}
