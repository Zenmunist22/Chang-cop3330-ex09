package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Tommy Chang
 */
public class Exercise09
{
    public static void main( String[] args )
    {
        int length, width, sqft;
        final int cFactor = 350;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length: ");
        length = sc.nextInt();
        System.out.println("Enter Width: ");
        width = sc.nextInt();
        sqft = length*width;
        int gallons = 0;
        if (sqft % cFactor > 0){
            gallons = (sqft / cFactor) + 1;
        }
        else{
            gallons = sqft/cFactor;
        }
        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet.", gallons, sqft);
    }
}
