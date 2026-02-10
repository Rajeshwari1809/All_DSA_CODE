package com.dsa.arrays;

import java.util.Scanner;

public class SmallestElementInArray {


    public static int findSmallestElementInArray(int arr[])
    {
        int smallestElement=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<arr[0]) {
                smallestElement=arr[i];
            }
        }
        return smallestElement;
    }


    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("smallest element in an array is " + findSmallestElementInArray(arr));

    }
}
