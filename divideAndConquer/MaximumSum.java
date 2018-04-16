package divideAndConquer;

public class MaximumSum {

		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a[]={3,4,6,8,2,3,9,9,10,6,7,11,8,7,2,4};
		//int a[]={2,2,2,2,2,2,2};
		//int a[]={10,9,8,7,6,5,4,3,2};
		//int a[]={-5,-6,-3,-6,-4,-2,-8,-1};
		
		//int a[]={5,20,19,25,7,21};
		
		int a[]={5,25,1,20};
		
		//int a[]={2,1};// will not work, need to handle
		
		MaximumSum ms=new MaximumSum();
		
		int[] result=ms.max_sum(a,0,(a.length-1));
		
		if(result[0] < -500)
		{	System.out.println("No such pairp exists");
		    System.exit(0); 
		}
		System.out.println("First number is present at index :"+result[0]+ " having value "+a[result[0]]);
		System.out.println("Second number is present at index :"+result[1]+ " having value "+a[result[1]]);
		System.out.println("Maximum sum is:"+(a[result[0]]+a[result[1]]));
		
	}

	
	int[] max_sum(int []a,int start,int end)
	{
		int[] result={-613483,-147348,-66488};		
		
		if(end==start)
		{			
			//System.out.println("sum1 end value"+end);
			result[0]=end;
			result[1]=end;
			result[2]=end;			
			System.out.println("first divided array with one elements at index "+end);
			return result;
		}else if(end==(start+1))
		{
			/*System.out.println("sum2 return"+end);
			System.out.println("sum2 start"+a[start]);*/
			result[0]=start;
			result[1]=end;			
			if(a[start] >= a[end])
				result[2]=start;
			else	
				result[2]=end;
			System.out.println("first divided array with two elements at index "+start+" "+end);
			return result;
		}		
		
		
		int mid=(start+end)/2;
		
		int[] result1=max_sum(a,start,mid);
		int[] result2=max_sum(a,mid+1,end);
		
		System.out.println("merge array :"+result1[0]+" "+result1[1]+" "+result1[2]);
		System.out.println("merge array :"+result2[0]+" "+result2[1]+" "+result2[2]);
		
		
		return mergeArrays(a,result1,result2);
		
	}
	
	
	int[] mergeArrays(int []a,int []result1,int []result2)
	{
		
		
		int[] result={-721871,-3489739,-8386489};
		int sum1;
		int sum2;
		
		if(result1[0]==result[0])
		{
			//no merging possible as array is in reversed order like 10,9,8,7,6,5,4,3,2,1 and hence no result possible
			
			return result1;
		}
		
		sum1=a[result1[0]]+a[result1[1]];
		sum2=a[result2[0]]+a[result2[1]];
		
		if(result1[0]==result1[1])
			sum1=a[result1[0]];
		if(result2[0]==result2[1])
			sum2=a[result2[0]];
		
		int mergesum=a[result1[2]]+a[result2[2]];
		
		//int max1=(sum1>sum2)?sum1:sum2;
	    //int max2=(mergesum>max1)?mergesum:max1;
	    //
		
		System.out.println("which sum is highest"+sum1+" "+sum2+" "+mergesum);
		
	    if(sum1>sum2 && mergesum<sum1 && (a[result1[1]]>=a[result1[0]]))
	    {
	    	System.out.println("sum1 is highest"+result1[0]);	
	      result[0]=result1[0];
	      result[1]=result1[1];	      
	    }else if(mergesum>sum2 && (a[result2[2]]>=a[result1[2]]))
	    {
	    	System.out.println("mergesum is highest"+result1[2]);
	    	result[0]=result1[2];
		   result[1]=result2[2];	
	    }else if ((a[result2[1]]>=a[result2[0]]))
	    {
	    	System.out.println("sum2 is highest"+result2[0]);
	    	result[0]=result2[0];
			result[1]=result2[1];	
	    }
	    
	    if(a[result1[2]] > a[result1[2]])
	    	result[2]=result1[2];
	    else
	    	result[2]=result2[2];		
	    
	    System.out.println("result after merge is  : "+result[0]+" "+result[1]+" "+result[2]);
	    
	   
	    return result;
	}
	
	
}

