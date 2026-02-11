package com.dsa.arrays;

import java.util.Scanner;

public class ReverseAnArray {

    public static void reverseAnArray(int arr[]){
        for(int i=0;i<arr.length-i-1;i++)
        {
            int temp=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=temp;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner((System.in));
        System.out.println("enter the size of the array");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("resulting array is ");
        reverseAnArray(arr);
        for(int value:arr)
        {
            System.out.print(value+ "\t");
        }



    }
}
