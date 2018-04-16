package dynamic;

public class MaxCoin {

	public static void main(String[] args) {
		
		
		int[][] value = new int[][]{
			  { 1,1,2,3,5},
			  { 3,10,5,10,1 },
			  { 2,2,3,1,2},
			  { 4,3,5,10,3},
			  { 5,10,3,2,5 }
			};
			
		int[][] cost = new int[][]{};
		
			int i=0;
			int j=0;
			while(i<=4)
			{
				while(j<=4)
				{
					
					if(i==0 && j==0)
					{
						cost[i][j]=value[0][0];
					}else
					{
						if(i==0 && j!=0)
						{
							cost[i][j]=value[][];
						}
					}
					j++;
				}
				i++;
			}
	}
}
