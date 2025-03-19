package session3;

public class MultiDimensional {
 //two dimensional convert into single dimensional
	public static void main(String[] args) {
		int[][] a = {{2,4},{5,7},{7,3},{3,1}};
		//Access all the elements in nested for loop
//		for(int i = 0; i<a.length; i++) {
//			for(int j = 0; j<a[i].length; j++){
//				System.out.print(a[i][j]);
//			}
//			System.out.println();
//		}
		
		for(int[]i:a) {     //2D to 1D
			for(int j:i) {  //1D to Variable
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
