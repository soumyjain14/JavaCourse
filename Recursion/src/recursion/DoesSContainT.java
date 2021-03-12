package recursion;

public class DoesSContainT {
	
	public static boolean checkSequence(String a, String b, int m, int n) {
		if(m==0) {
			return true;
		}
		if(n==0) {
			return false;
		}
		
		if(a.charAt(m-1)==b.charAt(n-1)) {
			return checkSequence(a, b, m-1, n-1);
		}
		
		return checkSequence(a, b, m, n-1);
		
	}
	
	public static boolean checkSequence(String a, String b) {
		int m=a.length();
		int n=b.length();
		return checkSequence(b,a, n,m);
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="st3h5irteuyarh!";
		String b="shrey";
		boolean ans=checkSequence(a, b);
		System.out.println(ans);
		
	

	}

}
