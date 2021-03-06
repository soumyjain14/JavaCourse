package recursion;

public class Keypad {
	
	public static String[] helper(int n) {
		if(n==2) {
			String ans[]= {"a","b","c"};
			return ans;
			
		}
		if(n==3) {
			String ans[]= {"d","e","f"};
			return ans;
		}
		if(n==4) {
			String ans[]= {"g","h","i"};
			return ans;
		}
		if(n==5) {
			String ans[]= {"j","k","l"};
			return ans;			
		}
		if(n==6) {
			String ans[]= {"m","n","o"};
			return ans;
		}
		if(n==7) {
			String ans[]= {"p","q","r","s"};
			return ans;
		}
		if(n==8) {
			String ans[]= {"t","u","v"};
			return ans;
		}
		if(n==9) {
			String ans[]= {"w","x","y","z"};
			return ans;
		}
		String ans[]= {"hi"};
		return ans;
	}
	
	public static String[] keyPad(int n) {
		if(n==0 || n==1) {
			String ans[]= {""};
			return ans;
		}
		
		String smallAns[]=keyPad(n/10);
		String helper[]=helper(n%10);
			
		String ans[]=new String[smallAns.length*helper.length];
		
//		
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			for(int j=0;j<helper.length;j++) {
				if(k<ans.length) {
				ans[k]=smallAns[i]+helper[j];
				k++;
				}
			}
		}
		return ans;
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=2;
		String ans[]=keyPad(n);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
		
//		
		
		
		

	}

}
