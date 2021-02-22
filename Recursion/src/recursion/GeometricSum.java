package recursion;
import java.lang.Math.*;

public class GeometricSum {
	
	public static double findGeometricSum(int k) {
		if(k==0) {
			return 1;
		}
		return findGeometricSum(k-1)+1/Math.pow(2, k);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ans=findGeometricSum(1);
		System.out.println(ans);

	}

}
