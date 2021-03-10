package recursion;

import java.util.Arrays;

public class Intersection {
	
	public static void intersection(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i=0;int j=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]==arr2[j]) {
				System.out.print(arr2[j]+" ");
				i++;
				j++;
				
			}
			else if(arr1[i]!=arr2[j] && arr1[i]<arr2[j]) {
				i++;
			}
			
			else if(arr1[i]!=arr2[j] && arr1[i]>arr2[j]) {
				j++;
			}
		
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1[]= {5,8,7,4,8};
		int input2[]= {4,6,6,10,8,5,5,1};
		
		intersection(input1, input2);

	}

}
