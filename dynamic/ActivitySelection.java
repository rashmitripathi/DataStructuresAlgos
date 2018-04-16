package dynamic;

public class ActivitySelection {
	
	public static void main(String[] args) {
		
		
		int s[]={-1,2,3,5,6,7,9,10,12,13,14,16};
		int f[]={-1,6,5,7,10,8,13,16,14,14,18,20};
		
		int l[]=new int[12];
		int p[]=new int[12];
		
		l[1]=1;p[1]=-1;
		
		for(int i= 2;i<s.length;i++)
		{
			l[i]=1;p[i]=-1;
			for(int k=1;k<=(i-1);k++)
			{
				if(f[k]<=s[i] && l[i]<l[k]+1)
				{
					l[i]=l[k]+1;
					p[i]=k;
				}
			}
		}
		
		
		
		int index=1;
		
		for(int i= 2;i<s.length;i++)
		{
			if(l[index]<l[i])
			{
				index=i;
			}
		}
		
		
		int total=l[index];
		int B[]=new int[12];
		
		System.out.println("Totalll :"+total);
		
		for(int j=total;j>=1;j--)
		{
			
			B[j]=index;
			index=p[index];
			System.out.println("B at index:"+j+"value  :"+B[j]);
		}
		
		
		
		
	}

}
