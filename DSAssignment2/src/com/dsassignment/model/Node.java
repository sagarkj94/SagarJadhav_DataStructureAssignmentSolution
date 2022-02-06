package com.dsassignment.model;

public class Node
{
    public int val;
    
	public Node right,left;
   
    public Node(int item)
    {
        val = item;
        left = right = null;
    }
}
