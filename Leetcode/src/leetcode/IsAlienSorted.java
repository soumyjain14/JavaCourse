package leetcode;

public class IsAlienSorted {

	public static boolean isAlienSorted(String[] words, String order) {

		for(int i=0;i<words.length-1;i++){
			String s1=words[i];
			String s2=words[i+1];
			if(!compare(s1, s2, order)) {
				return false;
			}
		}
		return true;
	}

	private static boolean compare(String word1, String word2, String order) {
		if(word1.equals(word2)) {
			return true;
		}

		int min=Math.min(word1.length(), word2.length());
		int j=0;
		while(j<min && word1.charAt(j)==word2.charAt(j)) {
			j++;
		}
		if(j==min) {
			return min==word1.length();
		}else {
			char a=word1.charAt(j);
			char b=word2.charAt(j);
			if(order.indexOf(a)<order.indexOf(b)) {
				return true;
			}else {
				return false;
			}
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String words[]= {"word","world","row"};
		String order="worldabcefghijkmnpqstuvxyz";
		boolean ans=isAlienSorted(words, order);
		System.out.println(ans);
	}

}
