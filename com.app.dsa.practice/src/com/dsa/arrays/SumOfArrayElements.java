package com.dsa.arrays;

import javax.print.DocFlavor;
import java.util.Scanner;

public class SumOfArrayElements {

    public static int addArrayElements(int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter array size");
        int arr[]=new int[sc.nextInt()];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("sum of array elements is " + addArrayElements(arr));
    }

}
