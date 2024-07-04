package arraystwoD;

public class diagonalsum_of_matrics {
	public static void diagonal(int a[][]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					sum+=a[i][j];
				}
				else if(i+j==a.length-1) {
					sum+=a[i][j];
				}
				
			}
		}
		System.out.println(sum);
	}

	public static void main(String args[]) {
		int a[][]= {{1,2,3},
				{4,5,6},
				{7,8,9}};
		diagonal(a);
	}
}
