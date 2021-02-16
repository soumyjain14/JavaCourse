package classes_and_objects;

public class DynamicArray {
	private int data[];
	private int nextIndex;
	
	public DynamicArray() {
		data=new int[5];
		nextIndex=0;
	}
	
	public int size() {
		return nextIndex;
		
	}
	
	public void add(int element) {
		if(data.length==nextIndex) {
			restructure();
			data[nextIndex]=element;
			nextIndex++;
		}else {
			data[nextIndex]=element;
			nextIndex++;
		}
	}
	
	private void restructure() {
		int temp[]=data;
		data=new int[(data.length*2)];
		for(int i=0;i<temp.length;i++) {
			data[i]=temp[i];
		}
		
	}
	
	public int get(int index) {
		if(index<data.length) {
		int element=data[index];
		return element;
		}else {
			return -1;
		}
	}
	
	public void set(int index,int element) {
		if(index>data.length) {
			return;
		}
		if(index<data.length) {
		data[index]=element;
		}
		else {
			add(element);
		}
	}
	
	public boolean isEmpty() {
		if(size()==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int removeLast() {
		int value=data[nextIndex-1];
		data[nextIndex-1]=0;
		nextIndex--;
		return value;
	}
	
	public void print() {
		if(size()==0) {
			return;
		}else {
		
		System.out.println("0");
		
		for(int i=1;i<data.length;i++) {			
			if(data[i]!=0) {
			System.out.println(data[i]);
			}
			
		}
		}
	}
	

}
