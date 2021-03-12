package test1;

public class DoesSContaintT {	
	
	public static boolean checkSequence(String a, String b) {
		if(b.length()==0) {
			return true;
		}
		if(a.length()==0) {
			return false;
		}
		
		
		if(a.charAt(0)==b.charAt(0)) {
			return checkSequence(a.substring(1), b.substring(1));
		}
		
		if(a.charAt(0)!=b.charAt(0)) {
			return checkSequence(a.substring(1), b);
		}
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="abchjsgsuohhdhyrikkknddf";
		String b="coding";
		boolean ans=checkSequence(a, b);
		System.out.println(ans);
				

	}

}
