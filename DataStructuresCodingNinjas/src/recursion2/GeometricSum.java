package recursion2;

public class GeometricSum {

	public static double findGeometricSum(int k) {
		if(k == 0) {
			return 1.0;
		}
		double smallOutput = findGeometricSum(k-1);
		return 1/Math.pow(2, k) + smallOutput;
	}
}
