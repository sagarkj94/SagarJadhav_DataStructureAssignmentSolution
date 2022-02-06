package com.dsassignment.service;

import java.util.ArrayList;

import com.dsassignment.model.Node;

public class SkewedTree {
	ArrayList<Integer> output=new ArrayList<Integer>();
	 public Node node;
	 public Node prevNode = null;
	    public Node headNode = null;
	   
	    // Function to to flatten the binary
	    // search tree into a skewed tree in
	    // increasing / decreasing order
	    public void flattenBTToSkewed(Node root)
	    {
	       
	        if(root == null)
	        {
	            return;
	        }
	       
	       
	            flattenBTToSkewed(root.left);
	        
	        Node rightNode = root.right;
	       
	        if(headNode == null)
	        {
	            headNode = root;
	            root.left = null;
	            prevNode = root;
	        }
	        else
	        {
	            prevNode.right = root;
	            root.left = null;
	            prevNode = root;
	        }
	        
	            flattenBTToSkewed(rightNode);
	      
	    }
	   
	    // Function to traverse the right
	    // skewed tree using recursion
	    public void traverseRightSkewed(Node root)
	    {
	        if(root == null)
	        {
	            return;
	        }
	        output.add(root.val);
	       
	        traverseRightSkewed(root.right);       
	    }
	    public void display()
	    {
	    	int size=output.size();
			for(int i=0;i <= size-1;i++)
			{
				System.out.print(output.get(i));
				if(i!=size-1)
					System.out.print("->");
			}
	    }
}
