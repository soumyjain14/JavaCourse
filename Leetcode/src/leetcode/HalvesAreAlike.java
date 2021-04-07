package leetcode;

public class HalvesAreAlike {
	
	public static boolean halvesAlike(String s) {
		int length=s.length()/2;int left=0;int right=0;
		String part1=s.substring(0, length);
		String part2=s.substring(length, s.length());
		for(int i=0;i<part1.length();i++) {
			if(part1.charAt(i)=='a' || part1.charAt(i)=='e' || part1.charAt(i)=='i' || part1.charAt(i)=='o' || 
					part1.charAt(i)=='u' || part1.charAt(i)=='A' || part1.charAt(i)=='E' || part1.charAt(i)=='I' || 
					part1.charAt(i)=='O' || part1.charAt(i)=='U') {
				left++;
			}
		}
		for(int i=0;i<part2.length();i++) {
			if(part2.charAt(i)=='a' || part2.charAt(i)=='e' || part2.charAt(i)=='i' || part2.charAt(i)=='o' || 
					part2.charAt(i)=='u' || part2.charAt(i)=='A' || part2.charAt(i)=='E' || part2.charAt(i)=='I' || 
					part2.charAt(i)=='O' || part2.charAt(i)=='U') {
				right++;
			}
		}
		return (right==left);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="AbCdEfGh";
		boolean ans=halvesAlike(s);
		System.out.println(ans);

	}

}
