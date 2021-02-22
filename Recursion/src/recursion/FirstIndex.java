package recursion;

public class FirstIndex {
	
	public static int firstIndex(int input[], int x, int startIndex) {
		if(startIndex<input.length) {
		if(input[startIndex]==x) {
			return startIndex;
		}
		
		
		int answer=firstIndex(input, x, startIndex+1);
		return answer;
		}
		return -1;
		
	}
	
	public static int firstIndex(int input[], int x) {
		return firstIndex(input, x, 0);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {34, 57, 82, 41, 65, 35, 82, 27, 36, 12, 6 ,40, 66, 99 ,25, 29, 22, 25, 12, 24, 65, 15, 5, 43, 28, 33, 76, 32, 13, 95, 22, 84, 71, 23, 28, 7, 65, 94, 18, 47, 9 ,42, 61 ,73 };
		int answer=firstIndex(input, 61);
		System.out.println(answer);
		
		

	}

}
