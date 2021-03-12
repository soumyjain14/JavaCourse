package test1;
import java.util.Arrays;
public class MaxProfitOnApp {
	
	public static int maximumProfit(int budget[]) {
		// Write your code here
        int sum=0;
		int max=Integer.MIN_VALUE;
		Arrays.sort(budget);
		for(int i=0;i<budget.length;i++) {
			sum=budget[i]*(budget.length-i);
			if(max<sum) {
				max=sum;
			}
			
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int budget[]= {34,78,90,15,67};
		int ans=maximumProfit(budget);
		System.out.println(ans);

	}

}
