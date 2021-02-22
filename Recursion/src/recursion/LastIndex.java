package recursion;

public class LastIndex {
	
	public static int lastIndex(int input[], int x,int lastIndex) {
		if(lastIndex>0) {
			if(input[lastIndex-1]==x) {
				return lastIndex-1;
			}
			int answer=lastIndex(input, x, lastIndex-1);
			return answer;
			
		}
		return -1;
	}
	
	public static int lastIndex(int input[], int x) {
		int lastIndex=input.length;
		return lastIndex(input,x,lastIndex);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {9,8,10,8};
		int ans=lastIndex(input, 8);
		System.out.println(ans);

	}

}
