package recursion;

public class ReturnCodes {


	public static  String[] getCode(String input) {
		if(input.length()==0) {
			String ans[]= {""};
			return ans;
		}

		int first=input.charAt(0)-'0';
		
		String smallAns[]=getCode(input.substring(1));
		String smallAns1[]= new String[0];

		int first2=0;
		if(input.length()>=2) {
			first2=(input.charAt(0)-'0')*10+input.charAt(1)-'0';
			if(first2>10 && first2<=26) {
				smallAns1=getCode(input.substring(2));

			}
		}

		String ans[]=new String[smallAns.length+smallAns1.length];
		int k=0;
		for(int i=0;i<smallAns.length;i++) {
			ans[k++]=getchar(first)+smallAns[i];

		}
		for(int i=0;i<smallAns1.length;i++) {
			if(k<smallAns.length+smallAns1.length) {
				ans[k++]=getchar(first2)+smallAns1[i];

			}
		}
		return ans;


	}

	public static char getchar(int n) {
		return (char)(96+n);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="1123";
		String ans[]=getCode(input);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}


	}

}
