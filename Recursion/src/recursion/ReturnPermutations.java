package recursion;

public class ReturnPermutations {

	public static String[] permutationOfString(String input) {
		if(input.length()==2) {
			String a=input.substring(1,2)+input.substring(0,1);
			String b=input.substring(0,1)+input.substring(1,2);
			String ans[]= {a,b};
			return ans;
		}
		int k=0;
		String ans[]=new String[fact(input.length())];
		for(int i=0;i<input.length();i++) {
			String smallAns[]=permutationOfString(input.substring(0,i)+input.substring(i+1));
			for(int j=0;j<smallAns.length;j++) {
				ans[k++]=smallAns[j]+input.charAt(i);
			}
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

		//System.out.println(input.substring(1,2)+input.substring(2));//c
		//System.out.println(input.substring(0,1)+input.substring(2,2));//b
		String ans[]=permutationOfString(input);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}




	}

}
