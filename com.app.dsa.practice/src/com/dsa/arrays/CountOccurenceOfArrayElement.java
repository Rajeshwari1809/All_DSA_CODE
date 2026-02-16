package com.dsa.arrays;

import java.util.Scanner;

public class CountOccurenceOfArrayElement {

    public static int countOccurence(int arr[],int input)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==input)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size");
        int arr[]=new int[sc.nextInt()];
        System.out.println("enter array elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element to count the occurence");
        int input=sc.nextInt();
        System.out.println("the "+ input+ " Occured " + countOccurence(arr,input)+ "times.");
    }
}
