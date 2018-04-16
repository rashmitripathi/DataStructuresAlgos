package greedy;

/*
 * Consider the following activity scheduling problem. Suppose we have a lecture hall and there are n activities, 
 * a1, a2, …, an, that need to use the lecture hall. 
 * Suppose the time is slotted into a sequence of slots, slot 1, slot 2, …, 
 * with each slot having exactly one hour length. We assume the lecture hall is available from slot 1 
 * and each activity needs to use one slot. Moreover, each activity is associated with a starting slot S[i] 
 * and a finish slot F[i], 1 <= S[i] <= F[i]  and needs be scheduled in any slot between S[i] and F[i] inclusive. 
 * Two activities ai and aj (1 <= i, j <= n) cannot be scheduled in a common slot. Please design an O(n2) greedy 
 * algorithm such that the maximum number of activities can be scheduled. You need to prove the correctness.
 * 
 */
public class ActivitySelection {

	public static void main (String[] args)
    {
        
		int [] s= {2,1,3,6,4};
		int [] f= {2,4,5,7,6};
		
       selectActivity(s, f);
    }
 
    
	
	static void selectActivity(int s[],int f[])
    {
		
		
		
    }

}
