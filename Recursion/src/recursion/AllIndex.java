package recursion;

public class AllIndex {
	
	public static int[] allIndexes(int input[], int x,int startIndex,int arr[]) {
		
		if(startIndex<input.length) {
		if(input[startIndex]==x) {
			arr[startIndex]=startIndex;
			
		}
		
		arr=allIndexes(input, x, startIndex+1,arr);
		return arr;
		}
		return arr;
	}
	
	public static int[] allIndexes(int input[], int x) {
		int SA[]=new int[10];
		int arr[]=new int[input.length];
		 SA=allIndexes(input, x,0,arr);
		 if(input[0]!=x) 
		 {
		 int targetIndex = 0;
		 for( int sourceIndex = 0;  sourceIndex < SA.length;  sourceIndex++ )
		 {
		     if( SA[sourceIndex] != 0 )
		         SA[targetIndex++] = SA[sourceIndex];
		 }
		 int[] newArray = new int[targetIndex];
		 System.arraycopy( SA, 0, newArray, 0, targetIndex );
		 return newArray;
		 }
		 else {
			 int targetIndex = 1;
			 for( int sourceIndex = 1;  sourceIndex < SA.length;  sourceIndex++ )
			 {
			     if( SA[sourceIndex] != 0 )
			         SA[targetIndex++] = SA[sourceIndex];
			 }
			 int[] newArray = new int[targetIndex];
			 System.arraycopy( SA, 0, newArray, 0, targetIndex );
			 return newArray;
		 }
		
			 
		 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {8,8,10,8,8};
		int arr[]=allIndexes(input, 8);
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
