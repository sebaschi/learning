package recursion2;

public class TowerOfHanoi {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		if(disks < 1) {
			return; // needed for case of input <= 1, because it otherwise leads to Stackoverflow.
		}
		if(disks == 1) {
			System.out.println(source + " " + destination);
			return;
		}
		towerOfHanoi(disks-1, source, destination, auxiliary);
		System.out.println(source + " " + destination);
		towerOfHanoi(disks-1, auxiliary, source, destination);
	}
	
	public static void towerOfHanoiCN(int n, char s, char h, char d) {
		if(n == 1) {
			System.out.println(s + " " + d);
			return;
		}
		towerOfHanoiCN(n-1, s, d, h);
		System.out.println(s + " " + d);
		towerOfHanoiCN(n-1, h, s, d);
	}
}
