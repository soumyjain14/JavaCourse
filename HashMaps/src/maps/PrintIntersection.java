package maps;

import java.util.HashMap;

public class PrintIntersection {
	
	public static void printIntersection(int arr1[], int arr2[]) {
		HashMap<Integer, Integer> map=new HashMap<>();
		for(int i=0;i<arr1.length;i++) {
			if(map.containsKey(arr1[i])) {
				int v=map.get(arr1[i]);
				map.put(arr1[i], v+1);
			}else {
				map.put(arr1[i], 1);
			}
		}
		for(int i=0;i<arr2.length;i++) {
			if(map.containsKey(arr2[i]) && map.get(arr2[i])>0) {
				System.out.println(arr2[i]);
				int v=map.get(arr2[i]);
				map.put(arr2[i], v-1);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {7,7,7};
		int arr2[]= {7,7,7,7};
		printIntersection(arr1, arr2);

	}

}
