package recursion;

public class ReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2) {
		if(input.length()==1 && input.charAt(0)==c1) {
			String m=Character.toString(c2);
			return m;
		}
		
		if(input.length()==1 && input.charAt(0)!=c1) {
			return input;
		}
		
		if(input.charAt(0)!=c1) {
			return input.charAt(0)+replaceCharacter(input.substring(1), c1, c2);
		}else {
			String m=Character.toString(c2);
			return m+replaceCharacter(input.substring(1), c1, c2);
			
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="abacd";
		String ans=replaceCharacter(s, 'a', 'x');
		System.out.println(ans);

	}

}
