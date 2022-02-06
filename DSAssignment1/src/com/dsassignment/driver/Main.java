package com.dsassignment.driver;

import java.util.Scanner;

import com.dsassignment.service.Construction;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the total no of floors in the building");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			System.out.println("enter the floor size given on day "+(i+1));
			int floor=sc.nextInt();
			if(floor <= size && floor != 0)
			{
				arr[i]=floor;
			}
			else
			{
				System.out.println("Invalid floor value.Please enter again for day "+(i+1));
				i=i-1;
			}
		}
		Construction output=new Construction();
		System.out.println("The order of construction is as follows ");
		output.orderOfConstruction(arr,size);
		
		sc.close();
	}

}
