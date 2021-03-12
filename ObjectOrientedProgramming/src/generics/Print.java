package generics;

public class Print {
	
	public static <T> void print(T input[]) {
		for(int i=0;i<input.length;i++) {
			System.out.print(input[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer input[]= new Integer[10];
		for(int i=0;i<input.length;i++) {
			input[i]=i+1;
		}
		print(input);
		String input1[]= {"Soumy","Jain","is"};
		print(input1);
		Character input2[]={'a','b','c'};
		print(input2);
		

	}

}
