package com.thoughtworks;

import java.util.Scanner;

public class PyhagoreanTriplet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter A number to Get Pythagorean Triplet: ");
        double number = sc.nextInt();
        Triplets triplets = new Triplets();
        triplets.getTriplets(number);


    }
}