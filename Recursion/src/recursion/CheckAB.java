package recursion;

public class CheckAB {
	
	public static boolean checkAB(String input) {
		if(input.length()<=0) {
			return true;
		}
		if(input.length()==1 && input.charAt(0)=='b') {
			return false;
		}
		
		
		
		boolean smallAns=checkAB(input.substring(1));
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abbaa";
		boolean ans=checkAB(input);
		System.out.println(ans);

	}

}
