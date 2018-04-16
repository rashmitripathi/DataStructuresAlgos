package greedy;

import java.util.Stack;

/*
 * Re-consider the following problem in Quiz 1. 
 * Given a sequence of n real numbers stored in a array, A[1], A[2], …, A[n], 
 * we wish to find two numbers A[i] and A[j], where i < j, such that A[i] <= A[j] and their sum is the largest. 
 * That is,A[i] + A[j] = max {A[u] + A[v] | 1 <= u < v <= n, A[u] <= A[v]}.
 * If no such two numbers, report - infinity. 
 * This time, please design an O(n) greedy algorithm to solve this problem
 */

public class MaximumSum {

	public static void main (String[] args)
    {
        //int [] a = {-2, -3, 5, -1, -2, 1, 4, -3};    
        //int [] a = {-2, -3, -4, 1, 2, -1, 5, -3};
		//int [] a = {-1, -2, -3, -4,-5};//no results as it is decreasing order
	   //int [] a = {-2, -1, -3, -1,-5};
		int [] a = {-1,2,3,4,5};
		
		maximumSum(a);
    }
 
	
	static void maximumSum(int num[])
    {
		int maxElement=(num.length-1);
		int max_sum=Integer.MIN_VALUE;
		int i=-1;
		int j=-1;
		
		System.out.println("maxFirst at index:"+num[maxElement]);		
		
		for(int k=((num.length) -2);k>=0;k--)
		{
			System.out.println("maxFirst at index:"+num[k]+num[maxElement]);
			if(num[k]+num[maxElement] > max_sum && num[maxElement] >= num[k])
			{	
				max_sum=num[k]+num[maxElement];
				i=maxElement;
				j=k;		
				System.out.println("max sum changed:"+max_sum+" "+k);
			}
			
			if (num[k] >= num[maxElement])
			{     
				maxElement = k;  
				System.out.println("maxElement changed:"+num[maxElement]);
			}
					
			
	    }
		
		System.out.println("maxFirst at index:"+i+j);
		System.out.println("maxFirst at index:"+i+"value    :"+num[i] );
		System.out.println("maxSecond at index:"+j+"value  :"+num[j]);
    }
}
