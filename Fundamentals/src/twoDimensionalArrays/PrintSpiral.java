package twoDimensionalArrays;

public class PrintSpiral {

	public static void spiralPrint(int arr[][]) {

		int row = arr.length;
		int col = arr[0].length;

		int totalElements = row * col;

		int cs = 0;
		int ce = col-1;
		int rs = 0;
		int re = row-1;

		int counter = 0;

		while(counter < totalElements) {

			// top row loop
			for(int i = cs; i <= ce; i++) {
				System.out.print(arr[rs][i] + " ");
				counter++;
			}
			rs++;

			//rightmost column loop
			for(int i = rs; i <= re; i++) {
				System.out.print(arr[i][ce] + " ");
				counter++;
			}
			ce--;

			// bottom row loop

			for(int i = ce; i >= cs; i--) {
				System.out.print(arr[re][i] + " ");
				counter++;
			}
			re--;

			//leftmost column loop

			for(int i = re; i >= rs; i--) {
				System.out.print(arr[i][cs] + " ");
				counter++;
			}
			cs++;

		}
	}

}
