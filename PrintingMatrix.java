/* 
 Write an algorithm to generate and print the matrix below:
 
1
22
333
4444
55555
666666
7777777
88888888
999999999

*/

public class PrintingMatrix {
	public static void main(String[] args) {
		int myMatrix[][] = new int[10][10];

		for (int i = 1; i < myMatrix.length; i++) {
			System.out.print(i);
			for (int j = 1; j < i; j++) {
				System.out.print(i);
			}
			System.out.print("\n");
		}
	}
}
