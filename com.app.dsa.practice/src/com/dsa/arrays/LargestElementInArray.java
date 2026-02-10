package com.dsa.arrays;

import java.util.Scanner;

public class LargestElementInArray {

    public static int findLargestElementInArray(int arr[])
    {
        int largestElement=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>arr[0])
            {
                largestElement=arr[i];

            }
        }
        return largestElement;
    }

    public static  void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size= sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter the array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        int result =findLargestElementInArray(arr);
        System.out.println("largest element in an array is " + result);
    }
}
