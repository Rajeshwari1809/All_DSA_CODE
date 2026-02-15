package com.dsa.arrays;

import java.util.Scanner;

public class ReverseAnArray {

    public static int [] reverseAnArray(int arr[]){

        int[] temp=new int[arr.length];
        for(int i=arr.length-1;i>=0;i--)
        {
            temp[arr.length-i-1]=arr[i];
        }
        return temp;
    }
    
//public static void reverseAnArrayUsingTemp(int []arr)
//{
//        for(int i=0;i<arr.length-i-1;i++)
//        {
//            int temp=arr[i];
//            arr[i]=arr[arr.length-i-1];
//            arr[arr.length-i-1]=temp;
//        }
//    }


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
        //reverseAnArrayUsingTemp(arr);

        int[] rev=reverseAnArray(arr);
        for(int value:rev)
        {
            System.out.print(value+ "\t");
        }
    }
}
