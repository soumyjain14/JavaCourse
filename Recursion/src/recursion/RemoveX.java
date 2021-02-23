package recursion;

public class RemoveX {
	
	public static String removeX(String input) {
		if(input.length()==1 && input.charAt(0)=='x') {
			return "";
		}
		
		if(input.length()==1 && input.charAt(0)!='x') {
			char s= input.charAt(0);
			String m=Character.toString(s);
			return m;
		}
		if(input.charAt(0)!='x') {
			return input.charAt(0)+removeX(input.substring(1));
		}else {
			return removeX(input.substring(1));
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="xxppx";
		String ans=removeX(input);
		System.out.println(ans);

	}

}
