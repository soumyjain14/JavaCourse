package recursion;

import java.util.Arrays;
import java.util.Scanner;

public class RoughWork {
	
	
	public static boolean hasAllCodes(String s, int k) {
		if(k==1) {
			if(s.contains("0") && s.contains("1")){
				return true;
			}
		}
		
		
		return false;
		
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="110";
		int k=1;
		boolean ans=hasAllCodes(s,k);
		System.out.println(ans);
		
		
	}

}
