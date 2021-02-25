package recursion;

public class QuickSort {

	public static int partition(int input[], int startIndex, int endIndex) {
		// Find pivot
		int pivot=input[startIndex];
		//Place pivot at its correct position
		int count=0;
		int k=startIndex+1;
		while(k<=endIndex) {
			if(pivot>=input[k]) {
				count++;

			}
			k++;
		}

		//Swapping with the pivot
		int temp;
		temp=pivot;

		int temp2=input[startIndex+count];

		input[startIndex+count]=temp;
		input[startIndex]=temp2;	
		int pivotPosition=startIndex+count;

		int i=startIndex;
		int j=endIndex;
		while(i<pivotPosition && j> pivotPosition) {
			if(input[i]<=pivot ) {
				i++;
			}
			else if(input[i]>pivot && input[j]>pivot) {
				j--;
			}else {

				if(input[i]>pivot && input[j]<=pivot) {
					temp=input[i];
					input[i]=input[j];
					input[j]=temp;
					i++;
					j--;
				}
			}


		}
		//System.out.println(pivotPosition);	
		return pivotPosition;
	}

	public static void quickSort(int[] input, int startIndex, int endIndex) {
		if(startIndex>=endIndex) {
			return;
		}

		int pivotPosition=partition(input,startIndex, endIndex);

		quickSort(input, startIndex, pivotPosition-1);
		//		

		quickSort(input, pivotPosition+1, endIndex);
		//System.out.println(pivotPosition);

	}

	public static void quickSort(int[] input) {
		quickSort(input, 0, input.length-1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[]= {1,5,2,7,3};
		quickSort(input);
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println(input.length);




	}

}
