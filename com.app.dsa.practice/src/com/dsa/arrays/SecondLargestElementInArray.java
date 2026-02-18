package com.dsa.arrays;

import java.util.Scanner;

public class SecondLargestElementInArray {


    public static int findSecondlargestelement(int arr[])
    {
        int largestElement=arr[0];
        int secondLargestElement=arr[1];
        for(int i=0;i<arr.length;i++)
        {
            if((arr[i])>largestElement)
            {
                secondLargestElement=largestElement;
                largestElement=arr[i];
            } else if (arr[i]>secondLargestElement && arr[i]!=largestElement) {
                secondLargestElement=arr[i];
                
            }
        }
        return secondLargestElement;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the size of the array");
        int arr[]=new int[sc.nextInt()];
        System.out.println("enter the elements of the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the second Largest Element of the array is " + findSecondlargestelement(arr));
    }
}
