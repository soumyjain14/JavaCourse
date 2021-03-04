package recursion;

public class PrintKeypad {
	public static String[] helper(int n) {
		if(n==0 || n==1) {
			String ans[]= {""};
			return ans;

		}
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
	
	public static void printKeypad(int input, String OutputSoFar) {
		if(input==0) {
			System.out.println(OutputSoFar);
			return;
		}
		String helper[]=helper(input%10);
		
		for(int i=0;i<helper.length;i++) {
			printKeypad(input/10, helper[i]+OutputSoFar);
			
		}
		
		
	}
	public static void printKeypad(int input) {
		printKeypad(input, "");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=24;
		printKeypad(input);
		
		
	}

}
