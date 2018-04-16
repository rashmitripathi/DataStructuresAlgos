package dynamic;

public class ActivitySelectionVariation {
public static void main(String[] args) {
		
		
		int s[]={-1,2,3,5,6,7,9,10,12,13,14,16};
		int f[]={-1,6,5,7,10,8,13,16,14,14,18,20};
		
		int l[]=new int[12];
		int p[]=new int[12];
		int time[]=new int[12];
		
		l[1]=1;p[1]=-1;time[1]=f[1]-s[1];
		int totalTime;
		
		for(int i= 2;i<s.length;i++)
		{
			l[i]=1;p[i]=-1; time[i]=f[i]-s[i];
			totalTime=time[i];
			for(int k=1;k<=(i-1);k++)
			{
				
				if(f[k]<=s[i] && totalTime<time[k]+time[i])
				{
					totalTime=time[k]+time[i];
					p[i]=k;
					//System.out.println(" total time changed at i:"+i+"       totalTime:"+totalTime);	
					
				}
			}
			
			 time[i]=totalTime;
			
			System.out.println("i:"+i+"       time:"+time[i]+"          p:"+p[i]);
			
		}
		
		
		
		int index=1;
		
		for(int i= 2;i<s.length;i++)
		{
			if(time[index]<time[i])
			{
				index=i;
			}
		}
		
		
		int total=time[index];
		
		int B[]=new int[12];
		
		System.out.println("Totalll :"+total);
		int j=0;
		
		while(index >0)
		{
			
			B[j]=index;
			index=p[index];
			System.out.println("B at index:"+j+"value  :"+B[j]);
			j++;
		}
		
		
	}

}
