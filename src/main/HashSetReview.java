package main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class HashSetReview {

    public static void main(String[] args) {

        HashSet<String> nama = new HashSet<>();

        boolean cobaLagi = true;

        while(cobaLagi){

            Scanner scanner = new Scanner(System.in);

            System.out.println("nama : ");
            nama.add(scanner.nextLine());

            System.out.println("tambah?");
            cobaLagi = scanner.nextBoolean();
        }

        System.out.println(nama);

    }

}
