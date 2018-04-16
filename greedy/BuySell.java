package greedy;

/*
 * 2	Suppose we drive a pickup truck from city A to city B. 
 * Along the high way, we will go through n apple markets, labeled with 1, 2, …, n, 
 * where you can buy or sell apples. City A and city B also have an apple market each. 
 * For convenience, we label city A with 0 and city B with n+1. From a customer point of view, 
 * the buying price B[i] and selling price S[i] (dollar per pound) at market i are known. 
 * An example with n = 4 is given below.
 
Now, we will stop at one of the stations to buy apples and then stop at another station to sell apples. 
Please design an O(n) greedy algorithm to find market i to buy apples, and find market j >= i to sell 
apples such that the profit will be maximized. We assume that it would be too costly and forbidden to 
drive backward. In the above example, the best result is to buy apples at market 3 and sell them at market 
5 with profit of (7-2 = 5) dollars per pound. It is allowed that i = j which means you buy and sell apples 
at the same market i. Note, you need do exactly one trade even the profit is negative.

 */
public class BuySell {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int B[]={5,4,8,2,7,9};
		//int S[]={3,3,7,1,6,7};	
		
		//int B[]={3,3,3,3,3,3};
		//int S[]={3,3,3,3,3,3};	
		
		  int B[]={5,4,8,2,7,9};
		  int S[]={3,3,7,1,6,6};	
		
		getBuySellMarket(B, S);
	}

	static void getBuySellMarket(int B[],int S[])
	{
		
		int profit=S[0]-B[0];
		
		//take from A market
		int i=0;
		int j=0;
		int buyMinimumIndex=0;
		
		
		for(int k=1;k<B.length;k++)
		{
			if (B[k]<B[buyMinimumIndex])
			{	
				buyMinimumIndex=k;
			}
			
			int currentProfit=S[k]-B[buyMinimumIndex];			
			
			if(currentProfit > profit)
			{
		           i=buyMinimumIndex;
		           j=k;
		           profit=currentProfit;
			}
		}
		
		
		System.out.println("Buy Market should be :"+i +"Price : "+ B[i]);
		System.out.println("Sell Market should be :"+j +"Price : "+ S[j]);
	}
}
