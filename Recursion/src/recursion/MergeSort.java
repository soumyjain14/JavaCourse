package recursion;

public class MergeSort {
	
	public static void merge(int input[],int startIndex,int endIndex) {
		int arr[]=new int[endIndex-startIndex+1];
		int mid=(startIndex+endIndex)/2;
		int i=startIndex;
		int j=mid+1;
		int k=0;
		
		while(i<=mid && j<=endIndex) {
			if(input[i]<input[j]) {
				arr[k++]=input[i];
				i++;
			}else {
				arr[k++]=input[j];
				j++;
			}
			
		}
		while(i<=mid) {
			arr[k++]=input[i];
			i++;
		}
		while(j<=endIndex) {
			arr[k++]=input[j];
			j++;
		}
		
		for(i=0;i<arr.length;i++) {
			input[startIndex+i]=arr[i];
		}
	}
	
	public static void mergeSort(int[] input, int startIndex, int endIndex) {
		if(startIndex>=endIndex) {
			return;
		}
		
		int mid=(startIndex+endIndex)/2;
		mergeSort(input, startIndex, mid);
		mergeSort(input, mid+1, endIndex);
		merge(input,startIndex,endIndex);
		
	}
		
		
	
	
	public static void mergeSort(int[] input) {
		mergeSort(input,0,input.length-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {6,8,9,7,3,5,1,0};
		//int input[]= {2};
		mergeSort(input);
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]);
		}

	}

}
