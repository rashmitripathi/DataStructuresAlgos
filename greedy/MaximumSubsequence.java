package greedy;

/*
 * 4	Re-consider the following problem in Quiz 1: Given a sequence of n real numbers, A[1], A[2], …, A[n]. 
 * We wish to find a subsequence form A[i] to A[j], 1 <= i <= j <= n, such that the sum of all 
 * numbers in this subsequence, m = , is maximized. Now, please design an O(n) algorithm to solve this problem
 * 
 * Refer Kadane's Algorithm
 */
public class MaximumSubsequence {

	public static void main (String[] args)
    {
        //int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        

        //int [] a = {-2, -3, -4, 1, 2, -1, 5, -3};
		//int [] a = {-1, -2, -3, -4,-5};
		//int [] a = {-2, -1, -3, -1,-5};
		int [] a = {-1,2,3,4,5};
		
        System.out.println("Maximum contiguous sum is " +
                                       maxSubArraySum(a));
    }
 
	
	static int maxSubArraySum(int num[])
    {
        int size = num.length;
        int finalSum = Integer.MIN_VALUE, currentSum = 0;
        
        int first=0,last=0; 
        int tempStart=0;
        
        for (int i = 0; i < size; i++)
        {
        	currentSum = currentSum + num[i];
            if (finalSum < currentSum)
            {    finalSum = currentSum;
                 first=tempStart;
                 last=i;
            }
            if (currentSum < 0)
            {	
            	tempStart = i + 1;
            	currentSum = 0;
            }
            System.out.println("finalSum :"+ finalSum+" currentSum:"+currentSum);
        }
        
        System.out.println(" Maximum first :"+ first +" last:"+last);
        
        return finalSum;
    }

}
