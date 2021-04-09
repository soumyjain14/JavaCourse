package leetcode;

public class IsAlienSorted {
	
	 public static boolean isAlienSorted(String[] words, String order) {
		 for(int i=0;i<words.length-1;i++) {
			 String s1=words[i];
			 String s2=words[i+1];
			 if(!compare(s1, s2, order)) {
				 return false;
			 }
			 
		 }
		 return true;
	 }
	 
	 private static boolean compare(String s1,String s2,String order) {
		 if(s1.equals(s2)) {
			 return true;
		 }
		 
		 int min=Math.min(s1.length(), s2.length());
		 int j=0;
		 while(j<min && s1.charAt(j)==s2.charAt(j)) {
			 j++;
		 }
		 if(j==min) {
			 return (min==s1.length());
		 }else {
			 char a=s1.charAt(j);
			 char b=s2.charAt(j);
			 if(order.indexOf(a)<order.indexOf(b)) {
				 return true;
			 }else {
				 return false;
			 }
		 }
		 
		 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]= {"apple","app"};
		String order="abcdefghijklmnopqrstuvwxyz";
		boolean ans=isAlienSorted(words, order);
		System.out.println(ans);
	}

}
