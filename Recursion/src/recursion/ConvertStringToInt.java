package recursion;
import java.lang.reflect.*;
import java.*;

public class ConvertStringToInt {
	
	public static int convertStringToInt(String input) {
		if(input.length()<=1) {
			return input.charAt(0)-48;
		}
		char s= input.charAt(0);
		String m=Character.toString(s);
		double ans=convertStringToInt(input.substring(1))+convertStringToInt(m)*Math.pow(10, input.length()-1);
		int value=(int)ans;
		return value;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="15870";
		int ans=convertStringToInt(s);
		System.out.println(ans);
		//System.out.println(s);

	}

}
