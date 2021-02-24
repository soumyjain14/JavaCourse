package recursion;

public class TowerOfHanoi {
public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
	if(disks==1) {
		System.out.println(source+" "+destination);
	}else {
	
	towerOfHanoi(disks-1, source, destination, auxiliary);
	towerOfHanoi(1, source, auxiliary, destination);
	towerOfHanoi(disks-1, auxiliary, source, destination);
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		towerOfHanoi(3, 'a', 'b', 'c');

	}

}
