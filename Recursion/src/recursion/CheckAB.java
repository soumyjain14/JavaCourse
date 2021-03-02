package recursion;

public class CheckAB {
	
	public static boolean checkAB(String input) {
		if(input.length()==0) {
			return true;
		}
		
		if(input.length()==1) {
			if(input.charAt(0)=='a') {
				return true;
			}else {
				return false;
			}
		}
		if(input.length()>=3 && input.substring(0, 3)=="abb") {
			return checkAB(input.substring(3));
			
		}else {
			return checkAB(input.substring(1));
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="abbaa";
		boolean ans=checkAB(input);
		System.out.println(ans);

	}

}
