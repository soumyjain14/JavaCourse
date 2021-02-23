package recursion;

public class AddStars {
	
	public static String addStars(String input) {
		if(input.length()<=1) {
			return input;
		}
		
		if(input.charAt(0)==input.charAt(1)) {
			return input.charAt(0)+"*"+addStars(input.substring(1));
		}else {
			return input.charAt(0)+addStars(input.substring(1));
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="baabb";
		String ans=addStars(s);
		System.out.println(ans);

	}

}
