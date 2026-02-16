package com.dsa.arrays;

import java.util.Scanner;

public class SumOfConsecutiveArrayElements {

    public static int addArrayElements(int arr[])
    {
        int n=arr[arr.length-1];
        int sum=n*(n+1)/2;
        return sum;
    }

    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter size of the array");
        int arr[]=new int[sc.nextInt()];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("sum of consecutive array elements is " +  addArrayElements(arr));
    }
}
