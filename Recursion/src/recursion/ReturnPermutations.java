package recursion;

public class ReturnPermutations {

	public static String[] permutationOfString(String input) {
		if(input.length()==0) {
			String ans[]= {""};
			return ans;

		}
		String ans[]=new String[fact(input.length())];
		int k=0;

		for(int i=1;i<=input.length();i++) {
			char first=input.charAt(i-1);

			String smallAns[]=permutationOfString(input.substring(0,i-1)+input.substring(i,input.length()));
			ans[k]=first+smallAns[0];
			k++;

		}
		for(int i=1;i<=input.length();i++) {
			char first=input.charAt(i-1);

			String smallAns[]=permutationOfString(input.substring(0,i-1)+input.substring(i,input.length()));
			ans[k]=first+smallAns[0];
			k++;

		}
		
		return ans;
	}
	
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abc";

		//System.out.println(input.substring(0,0)+input.substring(1,2));//c
		//System.out.println(input.substring(0,1)+input.substring(2,2));//b
		String ans[]=permutationOfString(input);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}




	}

}
