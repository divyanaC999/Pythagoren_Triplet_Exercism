package com.thoughtworks;

public class Triplets {


    public void getTriplets(double number)
    {
        double triplet1 = 0;
        double triplet2 = 0;
        double triplet3 = 0;
        for(triplet1 = 0; triplet1<number; triplet1++)
        {
            for(triplet2 = 0; triplet2<number; triplet2++)
            {
                for(triplet3 = 0; triplet3<number; triplet3++)
                {
                    if((squareOfTriplets(triplet1)+squareOfTriplets(triplet2) == squareOfTriplets(triplet3)) && (triplet1+triplet2+triplet3) == number)
                    {
                        System.out.println("Pythagorean Triplets for "+number+ " are: {"+triplet1+","+triplet2+","+triplet3+"}");
                    }
                }
            }
        }
    }

    /**
     *
     * @param triplet
     * @return - Square of given number
     */
    double squareOfTriplets(double triplet)
    {
        return triplet*triplet;
    }
}

