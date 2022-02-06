package com.dsassignment.service;

import java.util.LinkedList;
import java.util.Queue;

public class Construction {
	Queue<Integer> queue = new LinkedList<>();
	
	public void orderOfConstruction(int[] arr, int size) {
		// TODO Auto-generated method stub	
		int top=size;
		for(int i=0;i<size;i++)
		{
			System.out.println("Day "+(i+1));
			int floor=arr[i];
			if(floor==top)
			{
				pushToQueue(floor,arr,i);
				top=display()-1;
			}
			System.out.println();
		}
	}

	private int display() {
		// TODO Auto-generated method stub
		int top=0;
		int size=queue.size();
		for(int i=0;i<size;i++)
		{
		top=queue.remove();
		System.out.print(top+" ");
		}
		return top;
	}

	private void pushToQueue(int floor, int[] arr, int i) {
		// TODO Auto-generated method stub
		queue.add(floor);
		floor=floor-1;
		while(i>=0)
		{
			if(arr[i]==floor)
			{
				queue.add(floor);
				floor=floor-1;
				i--;
			}
			else
			{
				i--;
			}
		}
		
	}

}
