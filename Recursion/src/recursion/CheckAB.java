package recursion;

public class CheckAB {
	
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		if(input.length()==1 && input.charAt(0)=='a') {
			return true;
		}
		
		if(input.charAt(0)!='a') {
			return false;
		}
		if(input.length()>=3 && input.substring(0, 3).equals("abb")) {
			return checkAB(input.substring(3));
			
		}
		return checkAB(input.substring(1));
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abba";
		boolean ans=checkAB(input);
		System.out.println(ans);
		

	}

}
