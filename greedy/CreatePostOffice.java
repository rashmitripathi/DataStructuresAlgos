package greedy;


/*
 *1	There are n houses located on a west-east street. H[i] (meters), 1 < i < n, 
 *is the distance from the west-end of the street to the ith house. 
 *You may assume that H[1] < H[2] < H[3] < … < H[n]. 
 *There is no post office on the street. 
 *We plan to build several post offices on the street such 
 *that any house can reach a post office within 100 meters. 
 *Please design an O(n) algorithm to compute the locations for the post offices, 
 *P[j] (meters), 1 < j < m, where P[j] is the distance from the west-end of 
 *the street to the jth post office. Make sure that the number of post offices, 
 *m, is minimized.  
 */
public class CreatePostOffice {

	public static void main(String[] args) 
	{
		//int h[]={-1,200,400,600,800,1000,2000,2300};		
		//int h[]={-1,10,20,30,40,50};
		int h[]={-1,100,110,130,340,550};
		//int h[]={-1,100,110,130,140,150};
		 //int h[]={-1,100,110,130,240,250};
		//int h[]={-1,100,110};
		//int h[]={-1,70};
			
		createPostOffice(h);				

	}

	
	public static void  createPostOffice(int h[])
	{
		
		if(null == h)
			System.out.println("House should be present");
		
		int p[]=new int[h.length];		
		
		p[1]=h[1]+100;
		int m=1;
		
		
		for(int i=1;i<h.length;i++)
		{
			 if(Math.abs(p[m]-h[i])>100)
			 {
		        m++;
		        p[m]=h[i]+100;
			 }
		  
		}
		
		if(p[m]>h[h.length-1])
		{
			p[m]=h[h.length-1];
		}
		
		System.out.println("Total no of post offices:"+m);
		
		for(int i=1;i<p.length;i++)
		{
			if(p[i]!=0)
			  System.out.println("Post Office "+i+" at "+p[i]);
		}
	
		
	}
}
